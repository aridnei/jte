init( "ENV: ${pipelineConfig.parameters.environment}" )

to_development( pipelineConfig.parameters.environment ) {
  prepare_ansible_to dev
  prepare_package_to dev
  upload_package_to dev
  promote_on dev
}

to_stage( pipelineConfig.parameters.environment ) {
  prepare_ansible dev
  parallel app: {
             prepare_package_to sit
           },
           db: {
             prepare_db_changes_to sit 
             apply_db_changes_to sit
           }
  upload_package_to sit
  promote_on sit
}

to_production( pipelineConfig.parameters.environment ) {
  prepare_ansible prod
  parallel app: {
             prepare_package_to prod
           },
           db: {
             prepare_db_changes_to prod
             apply_db_changes_to prod 
           }
  upload_package_to prod
  promote_on prod
}
