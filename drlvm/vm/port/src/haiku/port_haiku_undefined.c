#include <signal.h>
#include <errno.h>

int pthread_attr_getstack(const pthread_attr_t *attr,
        void **stackaddr, size_t *stacksize) 
{
	/*TODO*/
	/* TOFIX: Implement */
	return EINVAL;
	
}


int pthread_attr_setschedpolicy(pthread_attr_t *attr,
	int policy)
{
	return 0;	
}

int pthread_getattr_np(pthread_t thread, pthread_attr_t *attr)
{
	return EINVAL;
}	

int pthread_attr_getguardsize(const pthread_attr_t *attr, 
	size_t *guardsize)
{
	return 0;
}

