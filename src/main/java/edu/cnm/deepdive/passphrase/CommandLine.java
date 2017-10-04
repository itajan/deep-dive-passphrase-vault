package edu.cnm.deepdive.passphrase;

import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class CommandLine {


  public static void main(String[] args) {
    try {
      Options options = buildOptions(); //"Options" is the instance and "options" is the type...just Java speak.
      CommandLineParser parser = new DefaultParser();
      org.apache.commons.cli.CommandLine cmdLine = parser.parse(options, args);
      if (cmdLine.hasOption("?")) {
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp("java" + CommandLine.class.getName(), options);
      }
    } catch (ParseException e) {
      e.printStackTrace();
    }

  }

  private static Options buildOptions() {
    Option sampleOpt = Option.builder("s").argName("value") //fluent style instead of saying builder.argName("value);
                                               .optionalArg(true)
                                               .longOpt("sample")
                                               .desc("Silly description")
                                               .required()
                                               .hasArg(true)
                                               .numberOfArgs(1)
                                               .type(Number.class)
                                               .build(); //has to be at the end and what we get out of it at the end is an "option"
    Option switchOpt = Option.builder("x").hasArg(false)
                                               .longOpt("exclude")
                                               .desc("Another description")
                                               .build();
    Option helpOpt =   Option.builder("?").longOpt("help")
                                               .required(false)
                                               .hasArg(false)
                                               .desc("Display this screen")
                                               .build();
    Options options = new Options();
    options.addOption(sampleOpt);
    options.addOption(switchOpt);
    options.addOption(helpOpt);
    return options;

  }
}
