void call( def app_env ) {
  stage('apply DB') {
    println 'applying db to ' + app_env.short_name
  }
}
