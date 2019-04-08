import logging
import datetime
import timeit

now = datetime.datetime.now().strftime('%Y-%m-%d %H:%M:%S')
logging.basicConfig(
    filename='execution.log',
    format='{0} %(levelname)s:\t%(message)s'.format(now),
    level=logging.DEBUG
)
LOGGER = logging.getLogger('log')
separator = '******************************************************************************************'


def clear_log():
    with open('execution.log', 'w'):
        pass


def get_logger():
    return LOGGER


def time_function(function, *args):
    time = timeit.timeit(
        '{0}({1})'.format(function.__name__, args),
        setup='from challenges import {0}'.format(function.__name__),
        number=1
    )
    LOGGER.info('{0} took {1} seconds'.format(function.__name__, time))
    LOGGER.info(separator)


def is_multiple(number, multiple):
    mod = number % multiple
    LOGGER.debug('\tIs {0} multiple of {1}: {2}'.format(number, multiple, mod == 0))
    return mod == 0


def fibonacci_up_to(limit):
    LOGGER.debug('Fibonacci up to {0}'.format(limit))
    fib_1 = 1
    fib_2 = 1
    fib_sum = []
    while fib_2 < limit:
        LOGGER.debug('\t{0} + {1} = {2} {3}'.format(fib_1, fib_2, fib_1 + fib_2, fib_sum))
        fib_sum.append(fib_1 + fib_2)
        fib_1 = fib_2
        fib_2 = fib_sum[-1]
    return fib_sum

