#if !defined (HAIKU)
#error "This file should only be included when building for Haiku"
#else
/*TODO - Is this the best way to resolve the following?
error: previous declaration of 'int pthread_getattr_np(_pthread_thread*, _pthread_attr**)' with 'C++' linkage
error: conflicts with new declaration with 'C' linkage
error: previous declaration of 'int pthread_attr_getstack(_pthread_attr* const*, void**, size_t*)' with 'C++' linkage
error: conflicts with new declaration with 'C' linkage
will we run into problems later?
*/
#ifndef PORT_HAIKU_UNDEFINED 
#define PORT_HAIKU_UNDEFINED
#ifdef __cplusplus
extern "C" {
#endif 
/* - Pthreads */
/* #if defined(FREEBSD) */
#define PTHREAD_MUTEX_RECURSIVE_NP PTHREAD_MUTEX_RECURSIVE


extern int pthread_getattr_np(pthread_t thread, pthread_attr_t *attr);

/* -- Following methods are defined in Ingo's pthread porting, copying the declarations verbatim */
/* [TSA TSS] */
extern int pthread_attr_getstack(const pthread_attr_t *attr,
        void **stackaddr, size_t *stacksize);
extern int pthread_attr_setschedpolicy(pthread_attr_t *attr,
		int policy);

#ifdef __cplusplus
}
#endif 
#endif
#endif
