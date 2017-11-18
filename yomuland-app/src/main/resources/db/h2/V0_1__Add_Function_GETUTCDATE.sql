CREATE ALIAS GETUTCDATE AS $$

Timestamp getUtcDate() {
  return new Timestamp(System.currentTimeMillis());
}
$$;
