void call( def app_env ) {
  stage('Prepare Ansible'){
    println 'running prepare ansible to ' + app_env.shot_name
  }
}
