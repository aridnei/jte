build()
to_development( pipelineConfig.environment ) {
  deploy_to dev
}
to_production( pipelineConfig.environment ) {
  deploy_to prod
}
