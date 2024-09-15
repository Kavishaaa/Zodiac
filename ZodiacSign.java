import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ZodiacSign {
    private static final Map<String, String> zodiacFacts = new HashMap<>();

    static {
        zodiacFacts.put("Sagittarius", """
            =>They love being fiercely independent.
            =>They're impatient.
            =>They're full of energy.
            =>Sagittarians are tremendously intuitive and they are curious about everything.
            =>They're extroverted introverts.
            =>They love to be the life and soul of the party.
            =>These people are known as rule breakers.
            =>Their almost every major life decision is dictated by an innate need to lead a life of freedom and adventure.
            =>The passion and zest for life continues throughout.
            =>So even towards the end of their lives, they might be found exploring and risking it all for one final adventure.
        """);
        zodiacFacts.put("Taurus", """
            =>These natives are best known for their sharp memory.
            =>It is said, Taurus remembers every detail from their past events.
            =>Taurians want the best in life: Taurus natives are often known to crave high standards.
            =>Even though they tend to fulfill their life goals with basic needs that will satisfy them.
            =>Taurians are food lovers. Wherever they go, they never stop eating.
            =>Taurus people love the outdoors. This zodiac enjoys being outdoors.
            =>These people are very sensitive, devoted, affectionate, loyal, honest, and trustworthy.
        """);
        zodiacFacts.put("Aries", """
            =>Aries are the most active zodiac sign.
            =>They're always working, investing in a hobby, exercising, or meeting new people.
            =>They're one of the most sarcastic zodiac signs.
            =>Their unfiltered observations can be hilarious to listen to, even if they're sarcastic about something that affects everyone in the room.
            =>Food, friends, life experiences, and music all come under Aries.
            =>This zodiac has a ton of connections because of its charm and energy.
            =>They try to make everyone's life a little easier.
        """);
        zodiacFacts.put("Virgo", """
            =>They have organized, analytical minds.
            =>They are curious people and have a natural gift for research.
            =>They have a talent for intuition.
            =>Virgos hate chaos, being wrong, squalor, and sloppiness.
            =>They are not a fan of being judged or lectured.
            =>They can be very private.
            =>Virgos are perfectionists.
        """);
        zodiacFacts.put("Aquarius", """
            =>Aquarius is one of the most introverted signs in the zodiac.
            =>Aquarians prefer to be alone with their ideas so they can process their thoughts and problem solve.
            =>This can lead Aquarius to be independent to a fault and to lose track of their friendships and other relationships.
            =>Aquarius needs space to create and often feels that others can hold them back.
            =>An Aquarius will not bend or change to suit someone else’s ideal.
            =>Aquarians are philosophers.
            =>An Aquarius spends a lot of their time with their head in the clouds trying to explain the unexplainable.
            =>Since Aquarius is often focused on big thinking, they are actually very relaxed when it comes to the little things.
        """);
        zodiacFacts.put("Cancer", """
            =>They’re in touch with their emotions.
            =>Cancers are the best caregivers around and will even put other people’s feelings above their own.
            =>With so much love to give, sometimes Cancer can be seen as overly emotional.
            =>Cancer’s shy nature doesn’t make them laugh-out-loud funny, but once you get to know them their blunt observational humor will have you howling.
            =>They have a hard time saying no.
            =>They tend to isolate when they’re feeling low.
            =>Cancer appreciates being and feeling at home, even though they’re always up for an adventure.
        """);
        zodiacFacts.put("Capricorn", """
            =>Stability and order are important to Capricorns.
            =>They are gifted with a sharp intuition.
            =>Capricorns are very patient, with themselves and others.
            =>They have confidence that they can achieve anything.
            =>Capricorns can find it difficult to share their own struggles.
            =>Their mood can change in the blink of an eye.
            =>They love to make others happy and feel safe.
            =>Capricorns are incredibly resourceful.
            =>They look for facts and evidence before rushing to conclusions.
            =>Capricorns are known to give amazing advice.
        """);
        zodiacFacts.put("Gemini", """
            =>Extroverted and fun-loving personalities are characteristics of Geminis.
            =>They enjoy being around others and are always up for a good time.
            =>Geminis are always encouraged to try new things, participate in risky activities, and travel.
            =>Problem-solving comes easily to Geminis when it includes mental obstacles or applying their ingenuity to develop novel solutions.
            =>Geminis have very high communication skills due to which they have a strong influence over people.
            =>Geminis are known to be highly smart and intelligent.
            =>Geminis have the ability to adapt things to every situation.
        """);
        zodiacFacts.put("Pisces", """
            =>Pisces love to help others.
            =>They love nothing more than to see the people around them happy and will do whatever they can to be a great friend.
            =>When you’re feeling down, a Pisces will use their caring ways to pull you back into a joyful state.
            =>Pisces are known to be very creative and to think deeply about large ideas and mystifying concepts.
            =>Pisces are idealistic dreamers.
            =>A mean word from others can get in their feelings and they can become sensitive if treated roughly.
            =>Pisces are great listeners and are never quick to judge people.
            =>Above all, a Pisces wants to enjoy every day without too much stress or worry about money, career, etc.
        """);
        zodiacFacts.put("Libra", """
            =>Libras are nurturing and caring.
            =>They're always in search of balance, harmony, and justice.
            =>Libras have great emotional intelligence; they know how to read emotions and feelings.
            =>They can be shy and have a hard time letting their guard down.
            =>Libras naturally love peace and unity, and that is reflected in their personality.
            =>They love talking, discussing, debating.
            =>Libras are very self-critical and always want to give 110% of themselves.
            =>They are always faithful and loyal.
        """);
        zodiacFacts.put("Leo", """
            =>Leos are usually depicted as selfless, loving, and emotionally invested in the happiness of others.
            =>Despite their loyalty, a Leo will often remember those who’ve wronged them and may hold a grudge indefinitely.
            =>Leos are said to be overly prideful at times and may receive criticism poorly, no matter the intent with which it’s delivered.
            =>Leos enjoy collecting things they earn due to their hard work, attaching sentimental value to them.
            =>Leos are often seen as a symbol of power.
            =>They're not afraid to tell you how they feel.
        """);
        zodiacFacts.put("Scorpio", """
            =>They believe in putting others before themselves.
            =>They will go to any lengths to make their loved ones happy and cannot see them suffer or get hurt.
            =>Scorpios hate small talk. They loathe artificial people and superficiality as they are passionate, driven people.
            =>If you tell them to do something, they would do the opposite of it.
            =>They love excitement, thrill, and adventures.
            =>They are rebellious by nature and do not like conforming to stereotypes.
            =>They are highly ambitious and are always determined and willing to work to achieve the best possible life.
            =>They do not believe in giving up or taking the easy way.
        """);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month =0; int date =0;
        while(true){
            System.out.println("Enter your birth month (in number):");
            month = sc.nextInt();
            if(month<=12 && month>=1){
                break;
            }else {
                System.out.println("Invalid month. Please enter a value between 1 and 12.");
            }
        }
        while(true){
            System.out.println("Enter your birth date:");
            date = sc.nextInt();
            if(date>=1 && date<=31){
                break;
            }else{
                System.out.println("Invalid day for the given month. Please enter a value between 1 and 31.");
            }
        }

        String zodiacSign = determineZodiacSign(month, date);

        if (zodiacSign != null) {
            System.out.println("Your Zodiac sign is: " + zodiacSign);

            int choice = 0;
            while (true) {
                System.out.println("Would you like to know a few facts about your zodiac sign?");
                System.out.println("1-Yes  2-No");
                choice = sc.nextInt();
                if (choice == 1 || choice == 2) {
                    break;
                } else {
                    System.out.println("Invalid choice. Please enter 1 or 2.");
                }
            }

            if (choice == 1) {
                String facts = zodiacFacts.get(zodiacSign.replaceAll("♑|♒|♓|♈|♉|♊|♋|♌|♍|♎|♏|♐", ""));
                if (facts != null) {
                    System.out.println(facts);
                } else {
                    System.out.println("Facts for this zodiac sign are not available.");
                }
            } else {
                System.out.println("Thank you :)");
            }
        } else {
            System.out.println("Illegal date");
        }

        sc.close();
    }

    private static String determineZodiacSign(int month, int date) {
        if ((month == 12 && date >= 22) || (month == 1 && date <= 19)) return "Capricorn♑";
        if (month == 1 && date >= 20 || month == 2 && date <= 17) return "Aquarius♒";
        if (month == 2 && date >= 18 || month == 3 && date <= 19) return "Pisces♓";
        if (month == 3 && date >= 20 || month == 4 && date <= 19) return "Aries♈";
        if (month == 4 && date>= 20 || month == 5 && date <= 20) return "Taurus♉";
        if (month == 5 && date >= 21 || month == 6 && date <= 20) return "Gemini♊";
        if (month == 6 && date >= 21 || month == 7 && date<= 22) return "Cancer♋";
        if (month == 7 && date >= 23 || month == 8 && date <= 22) return "Leo♌";
        if (month == 8 && date >= 23 || month == 9 && date<= 22) return "Virgo♍";
        if (month == 9 && date >= 23 || month == 10 && date <= 22) return "Libra♎";
        if (month == 10 && date >= 23 || month == 11 && date <= 21) return "Scorpio♏";
        if (month == 11 && date >= 22 || month == 12 && date<= 21) return "Sagittarius♐";
        return null;
    }
}

