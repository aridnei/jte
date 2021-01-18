build()
to_development( pipelineConfig.environment ) {
  deploy_to dev
}
to_stage( pipelineConfig.environment ) {
  deploy_to sit
}
to_production( pipelineConfig.environment ) {
  deploy_to prod
}
