void call( app_env ) {
  stage('Deploy to: ' + app_env.short_name) {
    println 'running deploy_to() ' + app_env.long_name
    println 'release ' + app_env.release
    println app_env
  }
}
