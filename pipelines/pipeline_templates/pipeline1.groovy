init( "ENV: ${pipelineConfig.parameters.environment}" )

to_development( pipelineConfig.parameters.environment ) {
  prepare_ansible dev
  prepare_package dev
  upload_to dev
  deploy_to dev
}

to_stage( pipelineConfig.parameters.environment ) {
  prepare_ansible dev
  parallel app: {
             prepare_package_to sit
           },
           db: {
             promote_db_to sit 
           }
  upload_to sit
  deploy_to sit
}

to_production( pipelineConfig.parameters.environment ) {
  prepare_ansible prod
  parallel app: {
             prepare_package_to prod
           },
           db: {
             promote_db_to prod 
           }
  upload_to prod
  deploy_to prod
}
