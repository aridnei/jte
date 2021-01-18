build()
to_development( pipelineConfig.parameters.environment ) {
  deploy_to dev
}
to_stage( pipelineConfig.parameters.environment ) {
  deploy_to sit
}
to_production( pipelineConfig.parameters.environment ) {
  deploy_to prod
}

