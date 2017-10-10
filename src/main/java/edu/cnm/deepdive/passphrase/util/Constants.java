package edu.cnm.deepdive.passphrase.util;

// e.g. keys for accessing resource bundle properties,resources

public class Constants {
    // Resource bundles names
    public static final String USAGE_BUNDLE = "usage-string";
	  public static final String WORDS_BUNDLE = "diceware-words";


    // Definitions of the Exclusion string variables
    public static final String EXCLUDES_REPEAT = "excludesRepeat";
    public static final String EXCLUDES_UPPERCASE = "excludesUppercase";
    public static final String EXCLUDES_LOWERCASE = "excludesLowercase";
    public static final String EXCLUDES_DIGITS = "excludesDigits";
    public static final String EXCLUDES_SYMBOLS = "excludesSymbols";
    public static final String EXCLUDES_AMBIGUOUS = "excludesAmbiguous";
    public static final String EXCLUDES_ORDER = "excludesOrder";

    // Definitions of the Specifications string variables
    public static final String SPECIFY_LENGTH = "specifyLength";
    public static final String SPECIFY_DELIMITER = "specifyDelimiter";
    public static final int MINIMUM_PASSWORD_LENGTH = 5;
    public static final int MAXIMUM_PASSWORD_LENGTH = 20;
    public static final int MINIMUM_PASSPHRASE_LENGTH = 7;
    public static final int MAXIMUM_PASSPHRASE_LENGTH = 12;
    public static final char[] DELIMITER_SELECTION = {'_', '-', '*',};

    // Definition of the mode switch string
    public static final String MODE_SWITCH= "modeSwitch";

    // Definition of the Help Message string
    public static final String HELP_MSG = "helpMsg";

    // Definitions of the Error Messages
    public static final String MODE_SELECT_ERROR = "modeSelectError";
    public static final String LENGTH_ERROR = "lengthError";
    public static final String ARGUMENT_ERROR = "argumentError";
    public static final String DELIMITER_ERROR = "delimiterErrorMessage";

    // Definitions of the Warning Messages
    public static final String LENGTH_WARNING = "lengthWarning";
    public static final String MODE_WARNING = "modeWarning";
    public static final String UNRECOGNIZED_OPTION = "unrecognizedOption";
    public static final String MISSING_OPTION = "missingOption";


    // Definitions of the arguments
    public static final String EXCLUDES_SYMBOLS_ARGS = "excludesSymbolsArgs";
    public static final String SPECIFY_LENGTH_ARGS = "specifyLengthArgs";
    public static final String SPECIFY_DELEMITER_ARGS = "specifyDelimiterArgs";

    // long option names
    public static final String NO_REPEAT_OPTION = "no-repeat";
    public static final String NO_UPPER_OPTION = "no-upper";
    public static final String NO_LOWER_OPTION = "no-lower";
    public static final String NO_DIGITS_OPTION = "no-digits";
    public static final String NO_AMBIGUOUS_CHARACTERS_OPTION = "no-ambiguous-characters";
    public static final String EXCLUDES_ORDER_OPTION = "exclude-order";
    public static final String EXCLUDES_SYMBOLS_OPTION = "exclude-symbols";
    public static final String LENGTH_OPTION = "length";
    public static final String HELP_OPTION = "help";
    public static final String PASSWORD_MODE_OPTION = "password-mode";
    public static final String DELIMITER_OPTION = "delimiter";
}
