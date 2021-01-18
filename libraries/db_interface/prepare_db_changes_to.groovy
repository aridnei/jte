void call( def app_env ) {
  stage('prepare DB') {
    println 'preparing db to ' + app_env.short_name
  }
}
