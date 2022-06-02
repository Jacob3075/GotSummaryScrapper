package com.jacob.got_summary.scrappers.chapter_summary

import com.jacob.got_summary.ChapterLink
import com.jacob.got_summary.Constants
import com.jacob.got_summary.models.Chapter
import kotlinx.serialization.decodeFromString

class GetSavedChapterSummary : GetChapterSummary {
	override fun getChapterSummary(index: Int, chapterLink: ChapterLink): Chapter = TODO()

	fun getChapterSummary(): List<Chapter> = Constants.json.decodeFromString(
		"""[
    {
        "index": 0,
        "title": "Prologue",
        "content": {
            "text": [
                "Three rangers of the Night's Watch are tracking a group of wildling raiders beyond the Wall, and encounter the Others, who had not been seen for eight thousand years.",
                "Gared, Will, and Ser Waymar Royce, three rangers from the Night's Watch, are tracking a band of wildling raiders in the haunted forest. Will has reported on wildlings that he found, claiming they are all dead. Gared, an older man who has been in the Night's Watch for decades, is uneasy, and insists that they turn back to the Wall; they have eight or nine days of travel ahead of them, which can turn into a fortnight if it snows. Waymar, a noble born youth of eighteen, however, has the command, and after making light of Gared's fears asks Will again for the details of what he saw.",
                "Will explains that he saw the wildlings' encampment. Their lean-to was covered by snow, they had no fire, and none of the wildlings moved the entire time he was watching. They were lying on the ground as if dead, but no blood was visible. Waymar suggests they might have been sleeping, but Will insists they are dead. There was also a woman up in a tree, but she did not move either. Gared suggests the wildlings must have been killed by the cold, but Waymar points out that the weather has not been cold enough to freeze men like that. He asks Will to lead them to the dead wildlings.",
                "With night falling, the rangers ride back to the wildling camp. Both Will and Gared sense something is wrong, but Waymar mocks them again and commands Gared to stay behind to guard the horses. When Gared suggests starting a fire, Waymar sardonically orders him not to. Will fears that Waymar's insolence will provoke Gared into drawing his sword, but Gared eventually acquiesces and no fire is lit.",
                "Will and Waymar climb up the ridge, Waymar much noisier than Will. When Will reaches his previous vantage point, he sees that the bodies are gone. Waymar, walking upright, reaches the top of the ridge and stands in plain sight. Will warns Waymar to get down, but Waymar just laughs. Determined to find the wildlings and make his first ranging a success, Waymar orders Will to climb a tree and look for a fire.",
                "Will reluctantly climbs a nearby sentinel tree. Below him, Waymar challenges an unseen foe. Will thinks he sees a white shadow moving below, but is not sure. He is about to call down a warning, but stops, unsure. Waymar calls to Will with unease in his voice as he turns in a circle with his sword drawn, and asks about the sudden cold, which Will also feels.",
                "An Other emerges from the woods: tall, gaunt, and white, dappled with a gray-green shimmer. Waymar nervously commands it to come no further and prepares himself for battle, challenging the Other to \"dance\" with him. Will notes that Waymar, in that moment, is no longer a boy, but truly a man of the Night's Watch. When more Others appear among the trees, Will considers calling out a warning, but decides not to do so, as it would require him to reveal his position. The sword of the first Other is made of inhumanly-sharp translucent crystal. Waymar is able to check the oncoming blows until his parry comes a bit too late and the Other's sword cuts through the mail under his arm. Waymar screams \"For Robert!\" and charges, but as his blade strikes the Other's sword, it shatters. One of the shards hits Waymar's left eye and he falls to his knees, blinded. All of the Others move in and slash at him mercilessly.",
                "Will turns his head away for a long time before looking back to see that the Others are gone. When he finally dares, Will climbs down, examines Royce's body, then picks up the knight's twisted and broken sword. He decides to bring it back to show to their commanders, hoping Gared is still with the horses. When Will stands up again, Waymar has risen and is standing over him. His remaining eye has turned blue. With an icy cold touch, Waymar's hands go around Will's throat."
            ],
            "imageDetails": [
                "https://awoiaf.westeros.org/images/thumb/9/93/AGameOfThrones.jpg/220px-AGameOfThrones.jpg",
                "https://awoiaf.westeros.org/images/thumb/c/ca/Royce_vs_other.jpg/350px-Royce_vs_other.jpg"
            ]
        },
        "place": "Haunted forest",
        "pov": "Will"
    },
    {
        "index": 1,
        "title": "Bran I",
        "content": {
            "text": [
                "Lord Eddard Stark dispenses justice to a Night's Watch deserter. When they are on their way back to Winterfell, and Jon Snow and Robb Stark find six orphaned direwolf pups.",
                "It is the ninth year of summer Seven-year-old Bran Stark is traveling with a party of twenty men, including his father Lord Eddard Stark, to see the king's justice done. This is the first time that he is allowed to join. Bran's older brother Robb thinks the man to be executed must be a wildling sworn to Mance Rayder, the King-Beyond-the-Wall, which makes Bran think of the tales Old Nan has told him about wildlings.",
                "The offender turns out to be an old man dressed in the ragged blacks of the Night's Watch who has lost his ears and a finger to frostbite. Lord Eddard questions the man briefly. Then two guardsmen drag the man to the stump of a tree and Theon Greyjoy, Eddard's ward, brings Eddard his Valyrian steel sword, Ice. Eddard pronounces the sentence (desertion of the Night's Watch is punished by death) and raises the blade. Jon Snow, Bran's bastard brother, reminds Bran not look away and so Bran watches as his father strikes off the man's head with a single stroke. The head lands near Theon, who laughs and kicks it away. Jon calls Theon an ass under his breath and compliments Bran on his poise during the execution.",
                "On the way back to Winterfell, Robb and Jon argue about whether or not the deserter died bravely before racing their horses to the bridge, leaving Bran and his pony behind. Eddard rides up and asks if Bran knows why he executed the man himself. Bran replies that the man was a wildling. Eddard corrects that the man was a deserter, then explains that the First Men—from whom the Starks descend—believed that the man who passes the sentence should perform the execution himself, lest he become too comfortable with ordering deaths; the Starks still hold to that principle.",
                "Jon calls from up ahead for them to come see what he and Robb have found. They find Robb holding something in his arms next to the corpse of a wolf larger than Bran's pony. Jon correctly identifies the corpse as a direwolf. Theon comments that direwolves have not been seen south of the Wall for two hundred years. Bran then notices that Robb is cradling a small pup, and gives it a stroke after Robb reassures him. Then Jon gives him another pup.",
                "When they inspect the mother's corpse, they find a large piece of shattered antler lodged in her throat. The soldiers in the company feel this to be a bad omen. Theon offers to kill the pups but Bran protests. Eddard initially states killing them would be best but changes his mind when Jon points out that there are five pups, one for each of Eddard's legitimate children; since the direwolf is the sigil of House Stark, they must be meant to have the wolves. Bran immediately realizes, along with everyone else, that the comparison only works because Jon is not claiming a pup for himself.",
                "Robb and Bran both declare that they are willing to nurse their pups by hand themselves. Eddard stresses that the children must feed and raise the pups themselves, not pass them off to the servants, and must treat them well lest they become dangerous. Both Robb and Bran state they will not allow the pups to die. As they begin to ride away, Jon hears a noise and goes back to discover a sixth pup, an albino with red eyes, that had crawled away from its mother. Bran finds it curious that it is the only pup that has opened its eyes. Theon claims that the albino will die quicker than the others, but Jon disagrees, claiming it for himself."
            ],
            "imageDetails": [
                "https://awoiaf.westeros.org/images/thumb/9/93/AGameOfThrones.jpg/220px-AGameOfThrones.jpg",
                "https://awoiaf.westeros.org/images/thumb/5/5d/Neds_justice_by_abepapakhian.jpg/300px-Neds_justice_by_abepapakhian.jpg",
                "https://awoiaf.westeros.org/images/thumb/0/0d/Mark_Evans_direwolf_pups.jpg/300px-Mark_Evans_direwolf_pups.jpg"
            ]
        },
        "place": "North of Winterfell",
        "pov": "Bran Stark"
    },
    {
        "index": 2,
        "title": "Catelyn I",
        "content": {
            "text": [
                "Lady Catelyn Tully seeks out her husband, Lord Eddard Stark, in the godswood of Winterfell to inform him of the news that his foster father, Lord Jon Arryn, the Hand of the King, is dead and that King Robert I Baratheon, his family, and half his court are on their way to Winterfell.",
                "Catelyn Stark seeks out her husband Eddard in the godswood following his return to Winterfell. She knows her husband always goes there after executing a man. She finds the godswood very dark and unsettling compared to the sunny one she remembers from her childhood home in Riverrun. Unlike her own family, the Starks keep faith with the old gods, rather than the Faith of the Seven.",
                "She finds Ned polishing his ancestral greatsword, Ice, under the heart tree at the center of the grove. He asks after the children, and Catelyn tells him they are deciding on the names for their new wolves. Ned notes that the man he executed is the fourth deserter this year. He adds that the man was half mad, that something had put a fear into him so deep that he could not reach him. The Night's Watch is dwindling, down to less than a thousand men, not just from desertions, but from ranging casualties. One day Ned may have to call his banners to fight Mance Rayder himself. Catelyn warns him that there are darker things beyond the Wall. Ned replies that the Others have been dead for eight thousand years, and that Maester Luwin claims they never existed at all. Catelyn replies that nobody had seen direwolves until today.",
                "When Ned asks why Catelyn has come, she tells him that Jon Arryn, his foster father and her brother-in-law, is dead. The news came in King Robert's own hand. When asked, Catelyn explains that Jon Arryn's widow--Catelyn's sister Lysa Arryn--and her son have returned to the Eyrie and says that she thinks her sister should not be alone and should have gone back to Riverrun. Ned urges Catelyn to take the children to keep her sister company, but then Catelyn informs him that Robert Baratheon has also written to say he is coming to Winterfell. This news gladdens Ned; it has been nine years since he last saw his old friend. However, Catelyn is worried about the omen of a direwolf found dead in the snow with an antler buried in its throat.",
                "With Robert coming, Catelyn confirms with Ned that they should send word to his brother Benjen on the Wall. Then Catelyn informs Ned that Robert's wife Cersei Lannister, their children, and her Lannister brothers are also coming. Ned does not like the Lannisters because they came to Robert’s cause only after victory was certain. Eddard is looking forward to seeing the children and then announces his worry about feeding them all."
            ],
            "imageDetails": [
                "https://awoiaf.westeros.org/images/thumb/9/93/AGameOfThrones.jpg/220px-AGameOfThrones.jpg",
                "https://awoiaf.westeros.org/images/thumb/0/0b/Ned_%26_Ice.jpg/250px-Ned_%26_Ice.jpg"
            ]
        },
        "place": "Godswood of Winterfell",
        "pov": "Catelyn Tully"
    },
    {
        "index": 3,
        "title": "Daenerys I",
        "content": {
            "text": [
                "The exiled Princess Daenerys Targaryen prepares to be presented to the Dothraki khal, Drogo, as her brother, King Viserys Targaryen, hopes to gain a Dothraki army by making such a marriage alliance.",
                "For the past half year, the exiled king Viserys Targaryen and his thirteen year old sister, Princess Daenerys Targaryen, having been residing in the manse of Illyrio Mopatis, a Magister of the Free City of Pentos. Viserys wishes to win back his father's throne and is in need of an army, which he hopes to acquire by making a marriage alliance with a Dothraki khal who leads a large khalasar.",
                "Viserys presents Daenerys with a gift from Magister Illyrio, a fine silk dress. Daenerys has to look like the princess she is, so Khal Drogo will ask for her hand in marriage. Although Daenerys is doubtful of Illyrio's motives, Viserys insists that the Magister simply wants to earn his good graces. Afraid of angering her brother (which he calls \"waking the dragon\"), Daenerys keeps silent about her mistrust. Viserys warns Daenerys not to fail him, and twists one of her niples to emphasize his threat. According to Viserys, when history of his reign is written, it will be said that his reign began that night.",
                "Viserys departs, leaving Daenerys alone with her thoughts. She dreads the feast she has to attend that evening, and her mind wanders to Westeros, the homeland she has never seen. She had been conceived shortly before her mother, Queen Rhaella Targaryen, fled King's Landing with Viserys, and born nine months later on Dragonstone. Yet she knows the stories Viserys has told her, the flight from King's Landing to Dragonstone; Her eldest brother, Rhaegar Targaryen fighting Robert Baratheon and dying; The Sack of King’s Landing, the gruesome death of Prince Aegon Targaryen, and the murder of her father, King Aerys II Targaryen, in the throne room, committed by a knight of his own Kingsguard. Nine months after the deaths of her brother and father, Daenerys's mother died giving birth to her (something for which Viserys has never forgiven her), during a summer storm which destroyed most of the Targaryen fleet which had been Dragonstone's last defense. When the garrison of Dragonstone was wiling to give Viserys and Daenerys over to Stannis Baratheon, who was on his way to take Dragonstone, Ser Willem Darry and four loyal men secretly took them to Braavos. There they lived in a big house with a red door. However, Ser Willem died, leaving them without a guardian, and the servants stole what money was left. When Viserys and Daenerys were put out of the house not long afte, they began to travel from city to city, never staying anywhere long, as Viserys feared the Usurper's assassins. Daenerys recalls how rich merchants, archons and magisters became less and less willing to host the Targaryens as the years went by, and how Viserys had been forced to sell their mother's crown. However, despite the lack of support, Viserys has become obsessed with recovering the Iron Throne. Daenerys knows that he is being called \"the Beggar King\" behind his back, and wonders if people have given her a nickname too.",
                "Illyrio's servants come to bathe Daenerys and prepare her for the feast given at the manse of Khal Drogo, where she is to meet and impress the Khal, so he will ask for her hand in marriage. The servants tell her how lucky she is to marry a man so rich that even his slaves wear golden collars. Once she is properly dressed, her brother returns with Magister Illyrio and commands her to stand up and turn around. Illyrio showers Daenerys with compliments while Viserys complains she is too skinny and too young. Illyrio reassures him that she is old enough for the khal and comments on her silver-gold hair and purple eyes, the hallmarks of old Valyrian nobility. When Viserys states that barbarians are said to have queer tastes such as boys and sheep, Illyrio warns him not to say these things to Khal Drogo, creating a flare of anger in Viserys’ eyes.",
                "The three of them journey in Illyrio's litter to Khal Drogo's manse in the pitch dark. Viserys states that ten thousand Dothraki “screamers” will be enough to overthrow the usurper when combined with those in Westeros that are awaiting his return. He speculates on those who would join their cause: House Tyrell, House Redwyne, House Darry, House Greyjoy, and the Dornishmen. Illyrio assures Viserys that the people in the Seven Kingdoms secretly await his return, though Daenerys doubts him.",
                "Illyrio says that Drogo’s mansion was a gift from the magisters of Pentos, to help win Drogo's friendship. They arrive at the mansion and are announced as King Viserys III and Princess Daenerys. Illyrio points out several prominent guests, including Ser Jorah Mormont, who had fled the Seven Kingdoms under sentence of death several years before, and has since spent much time among the Dothraki. Illyrio then points out Khal Drogo himself, who is as graceful as a panther, and younger than Daenerys had expected. Viserys notes his long braid, which means he has never been defeated in combat. Daenerys only notes his cold, hard face and is afraid of him. She asks to go home, provoking a rant from Viserys about how their home has been taken away from them. Daenerys only meant their rooms in Illyrio’s estate, but none of the places they have stayed in have been Viserys' home. Viserys also assures Daenerys that he would let Khal Drogo's whole khalasar, including their horses, rape her if it would win him back the Seven Kingdoms. He then tells her to stop crying, because Illyrio is leading Khal Drogo over to meet them. Daenerys stops crying, stands up straight, and smiles."
            ],
            "imageDetails": [
                "https://awoiaf.westeros.org/images/thumb/9/93/AGameOfThrones.jpg/220px-AGameOfThrones.jpg",
                "https://awoiaf.westeros.org/images/thumb/f/f6/Aprilis420_targaryen.jpg/220px-Aprilis420_targaryen.jpg",
                "https://awoiaf.westeros.org/images/thumb/7/77/John_MatsonViserys_TargaryenII.png/350px-John_MatsonViserys_TargaryenII.png"
            ]
        },
        "place": "Pentos Illyrio's manse Drogo's manse",
        "pov": "Daenerys Targaryen"
    },
    {
        "index": 4,
        "title": "Eddard I",
        "content": {
            "text": [
                "King Robert I Baratheon arrives with his party at Winterfell, where he offers Lord Eddard Stark the position of Hand of the King and proposes a betrothal between Eddard's daughter Sansa and his own son, Prince Joffrey.",
                "The king's party, three hundred strong, rides into Winterfell. Eddard recognizes Ser Jaime Lannister, Tyrion Lannister, Prince Joffrey Baratheon, and Sandor Clegane, but does not recognize his old friend King Robert until Robert calls out. Eddard is shocked to see that Robert has gained 8 stone (112 lbs) since they last saw each other nine years ago during Greyjoy's Rebellion. Eddard pays obeisance as Queen Cersei and the younger children debark from the wheelhouse. After the formalities of greeting, including the introduction of children from both parties, Robert insists on being taken down to the crypts of Winterfell where the dead of House Stark are buried, so he can pay his respects to Eddard's sister. Queen Cersei objects, but is disregarded by Robert, and quietly led away by her twin brother.",
                "Ned asks Robert about his journey and Robert complains of the distance that has to be traveled in the vast emptiness of the north. Robert then describes the advantages of living in the south, telling Ned he has to see the wonders, the warmth, and the undress of the women.",
                "They descend into the crypt, which is an effort for the out-of-shape Robert. Robert wants to visit the tomb of Ned's sister Lyanna Stark, who was his betrothed. They pass the dead of House Stark with statues in front of the crypts, each lord holding a sword on his lap with a direwolf at his feet. They arrive at the last of the occupied crypts. Here there are three tombs for Ned's father Rickard, his elder brother Brandon, and his sister Lyanna. Robert declares that Ned should have buried Lyanna on a sunny hillside, but Ned explains that she was a Stark of Winterfell and belongs here as was her wish. Ned remembers her dying, with only he and his friend Howland Reed nearby, while Robert recalls taking his vengeance on Rhaegar Targaryen for what he did to Lyanna, regretting that he only got to kill him once. Ned suggests that they should return to the surface where Robert's wife will be waiting. Robert replies that the Others can take his wife, but they start back all the same.",
                "As they return, Ned asks about Jon Arryn and Robert declares that he has never seen a man die so quickly: from healthy to dead within a fortnight. Ned asks how Jon's widow Lysa is bearing her grief, explaining that Catelyn fears for her sister. Robert confides that he thinks Jon’s death has driven Lysa mad and that she has taken her son back to the Eyrie. Robert had hoped to foster the sickly boy with Tywin Lannister, but Lysa refused to hear of it and left in the dead of night; Cersei was furious. Ned, who does not trust Tywin, is relieved. Ned asks to foster Robert Arryn himself, but Tywin has already agreed and Ned taking him as a ward would be an insult to Tywin.",
                "Ned comments that Robert should visit the Wall, but Robert responds that he has more important concerns such as replacing Lord Arryn, who held several important positions such as Warden of the East. Ned reminds Robert that that title traditionally goes with the domain of House Arryn but Robert declares that he will not appoint six-year-old Robert Arryn as Warden of the East. Ned reminds Robert that during times of peace the title is only an honor. The king is not pleased--the son is not the father, though maybe when the boy is grown the title will be given back. Robert mentions that he also needs a new Hand of the King and offers the position to Ned so they can work together again. Then Robert tells Ned how the responsibilities bore him and complains that he is surrounded by flatterers and fools. He insists that he wants Ned to come south to King's Landing to be Hand of the King, the second most important man in the kingdom.",
                "Ned does not want the position and tries to declare himself unworthy of the honor. Robert only jokes that he is not trying to honor Ned but to get him to run the kingdom for him, relating the low-born saying that “the King eats and the Hand takes the shit.” Robert asks for at least a smile, but Ned replies that it is said to be so cold in the North that a man's laughter freezes in his throat and chokes him to death.",
                "King Robert also offers to marry his son, Prince Joffrey, to Ned's eleven-year-old daughter Sansa Stark to join the Houses of Stark and Baratheon as he and Lyanna were supposed to. Ned hesitates to make this decision, wishing to speak to his wife, but Robert asks him not to take too long. Ned is filled with a sense of foreboding, knowing that Winterfell is where he belongs, and that winter is coming."
            ],
            "imageDetails": [
                "https://awoiaf.westeros.org/images/thumb/9/93/AGameOfThrones.jpg/220px-AGameOfThrones.jpg",
                "https://awoiaf.westeros.org/images/thumb/3/34/Federico_Musetti_Cersei%27s_Wheelhouse.png/300px-Federico_Musetti_Cersei%27s_Wheelhouse.png",
                "https://awoiaf.westeros.org/images/thumb/7/75/Ned_and_Robert_at_tomb.jpg/200px-Ned_and_Robert_at_tomb.jpg"
            ]
        },
        "place": "Winterfell Crypt of Winterfell",
        "pov": "Eddard Stark"
    },
    {
        "index": 5,
        "title": "Jon I",
        "content": {
            "text": [
                "Jon Snow attends the feast Winterfell is holding for the royal guests and speaks with both Benjen Stark and Tyrion Lannister.",
                "A feast is held in Winterfell in honor of King Robert's royal visit. Jon decides he is thankful his bastardy has relegated him to the far end of the hall with the younger squires instead of the king's family. Here he can drink as much as he wants (he has a man’s thirst) and mingle freely with those around him.",
                "Jon watches the king and his family as they arrive. He recognizes Queen Cersei's false smile and is disappointed with fat, red-faced King Robert. The 8-year-old Princess Myrcella seems smitten with her escort Robb, leading Jon to decide she is insipid. Arya is escorted by plump, young Prince Tommen. The 12-year-old Crown Prince Joffrey (who is even taller than Robb) is escorting the radiant Sansa. Jon decides he does not like Joffrey’s pouty lips or the disdain the prince seems to hold for Winterfell. He also notes that the queen's brother Jaime Lannister looks like a proper king, and that waddling dwarf Tyrion Lannister is grotesquely fascinating, as ugly as Jaime and Cersei are beautiful. The last to enter are Benjen Stark and Theon Greyjoy.",
                "Jon feeds his direwolf Ghost under the table and watches the pup silently face down a full-grown dog three times his size. Bringing his wolf to the feast is another perk to being the bastard. Jon is soon joined by his uncle Benjen, who asks Jon how much he's had to drink, adding that Jon is older than he was when he first got truly drunk. Benjen asks about Ghost and Jon explains that he named him Ghost for his white color and because he never makes a sound. Benjen then asks why Jon is not at the main table and Jon says flatly that Lady Catelyn thought seating a bastard with the king might give offense.",
                "Benjen comments that Eddard does not seem festive and Jon adds that neither does the queen, probably because of King Robert's visit to the crypts. Benjen commends Jon's keen observation and remarks that he could use a man like him on the Wall. Jon asks if he can return to the Wall with Benjen. Benjen replies that the Wall is a hard place for a boy, but Jon counters that he will turn 15 on his next name day and it's said bastards grow up faster than purebloods. Jon thinks about how all his half brothers and sisters have futures, but there is no future for a bastard. Benjen says that he should know a woman and father a bastard or two first, to know what he will be giving up. This angers Jon, who states that he will never father a bastard and runs off with Ghost at his heels before anyone can see him cry.",
                "As Jon is leaving, Tyrion Lannister speaks to him from a ledge in the deserted yard and asks if he can take a look at Ghost. Jon offers to help him down, but Tyrion jumps down, acrobatically landing on his hands and vaulting to his feet. Ghost is uncertain about Tyrion, but submits to examination at Jon's command. Tyrion asks if Jon is Eddard's bastard. Jon bridles and Tyrion apologizes that as a dwarf he can usually speak as he pleases, like a jester. He comments that Jon seems to have more of the North in him than his half-siblings. Tyrion advises Jon never to forget who and what he is so that no one can use it against him. When Jon questions what Tyrion would know about being a bastard, Tyrion replies that all dwarfs are bastards in their father’s eyes and that, although all dwarfs are bastards, not all bastards need to be dwarfs."
            ],
            "imageDetails": [
                "https://awoiaf.westeros.org/images/thumb/9/93/AGameOfThrones.jpg/220px-AGameOfThrones.jpg",
                "https://awoiaf.westeros.org/images/thumb/9/91/Sardag_jon_snow.jpg/150px-Sardag_jon_snow.jpg"
            ]
        },
        "place": "Winterfell",
        "pov": "Jon Snow"
    }
]
"""
	)
}
