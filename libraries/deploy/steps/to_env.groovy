void call( String env_name, body ) {
  println 'running to_env() ' + env_name
  if ( env_name == 'prod' ) {
    println 'skiping...'
    return
  }
  println 'following...'
  body()
}
