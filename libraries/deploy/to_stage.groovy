void call( String env_name, body ) {
  if ( env_name != 'sit' ) {
    return
  }
  println 'following...'
  body()
}
