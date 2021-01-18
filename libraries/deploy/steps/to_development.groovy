void call( String env_name, body ) {
  if ( env_name != 'dev' ) {
    return
  }
  println 'following...'
  body()
}
