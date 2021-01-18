void call( app_env ) {
  stage('Promote'){
    println 'promoting on ' + app_env.short_name
  }
}
