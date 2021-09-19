**[Prefer `Set` Instead of `List` in `@ManyToMany` Associations](https://github.com/AnghelLeonard/Hibernate-SpringBoot/tree/master/HibernateSpringBootManyToManyBidirectionalListVsSet)**

**Description:** This is a Spring Boot example of removing rows in case of a bidirectional `@ManyToMany` using `List`, respectively `Set`. The conclusion is that `Set` is much better! This applies to unidirectional as well!

**Key points:**
- using `Set` is much more efficent than `List`