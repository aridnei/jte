void call( String env_name, body ) {
  if ( env_name != 'prod' ) {
    return
  }
  println 'following...'
  body()
}
