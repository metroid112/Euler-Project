import utils
import challenges


def main(inside_recursion):
    logger = utils.get_logger()
    utils.clear_log()
    if not inside_recursion:
        utils.time_function(main, True)
    else:
        logger.info('Starting the program...')
        # utils.time_function(challenges.multiplesof3and5, 1000)
        # utils.time_function(challenges.evenfibonaccinumbers, 4000000)
        # utils.time_function(challenges.largestprimefactor, 600851475143)
        # utils.time_function(challenges.largestpalindromeproduct, 3)
        # utils.time_function(challenges.smallestmultiple, 20)
        utils.time_function(challenges.sumsquaredifference, 100)


if __name__ == '__main__':
    main(False)
