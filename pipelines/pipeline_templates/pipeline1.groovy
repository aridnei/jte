init( "ENV: ${pipelineConfig.parameters.environment}" )

to_development( pipelineConfig.parameters.environment ) {
  prepare_ansible_to dev
  prepare_package_to dev
  upload_package_to dev
  promote_to dev
}

to_stage( pipelineConfig.parameters.environment ) {
  prepare_ansible dev
  parallel app: {
             prepare_package_to sit
           },
           db: {
             promote_db_to sit 
           }
  upload_package_to sit
  promote_to sit
}

to_production( pipelineConfig.parameters.environment ) {
  prepare_ansible prod
  parallel app: {
             prepare_package_to prod
           },
           db: {
             promote_db_to prod 
           }
  upload_package_to prod
  promote_to prod
}
