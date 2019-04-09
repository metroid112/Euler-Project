import utils
import challenges


def main():
    logger = utils.get_logger()
    utils.clear_log()
    logger.info('Starting the program...')
    utils.time_function(challenges.multiplesof3and5, 1000)
    utils.time_function(challenges.evenfibonaccinumbers, 4000000)
    utils.time_function(challenges.largestprimefactor, 600851475143)
    utils.time_function(challenges.largestpalindromeproduct, 3)


if __name__ == '__main__':
    main()
