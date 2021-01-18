void call( app_env ) {
  stage('Prepare Ansible'){
    println 'running prepare ansible to ' + app_env.short_name
  }
}
