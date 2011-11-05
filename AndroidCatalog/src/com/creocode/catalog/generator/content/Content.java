package com.creocode.catalog.generator.content;
import java.util.Vector;
/**
 * Generated
 *@author Artur Polit
 *
 **/
public class Content {

	public Vector categories = new Vector();
	public Vector items = new Vector();

	//temp variables
	Category category;
	Category subCategory;
	Item item;

	public void initCategories() {
		//temp category & item

		items.addElement(new Item());
		Category topCategory = new Category();
		categories.addElement(topCategory);

		category = new Category();
		category.title = "English";
		category.parentId = 0;

		categories.addElement(category);
		topCategory.addSubCategory(new Integer(1));

		subCategory = new Category();
		subCategory.title = "Elementary";
		subCategory.parentId = 1;

		item = new Item();
		item.title = "Cross sign";
		item.intro = "";
		item.content = "In the name of the Father, and the Son, and the Holy Spirit. Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(1));

		item = new Item();
		item.title = "Doxology";
		item.intro = "";
		item.content = "Glory be to the Father, and to the Son, and to the Holy Spirit. As it was in the beginning, is now, and ever shall be, world without end. Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(2));

		item = new Item();
		item.title = "The Apostle's Creed";
		item.intro = "";
		item.content = "I believe in God, the Father Almighty, Creator of Heaven and earth; and in Jesus Christ, His only Son, Our Lord, Who was conceived by the Holy Ghost, born of the Virgin Mary, suffered under Pontius Pilate, was crucified; died, and was buried. He descended into Hell; the third day He arose again from the dead; He ascended into Heaven, sitteth at the right hand of God, the Father Almighty; from thence He shall come to judge the living and the dead. I believe in the Holy Spirit, the holy Catholic Church, the communion of saints, the forgiveness of sins, the resurrection of the body, and the life everlasting. Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(3));

		item = new Item();
		item.title = "Our Father";
		item.intro = "";
		item.content = "Our Father, Who art in heaven, Hallowed be Thy Name. Thy Kingdom come. Thy Will be done, on earth as it is in Heaven. Give us this day our daily bread. And forgive us our trespasses, as we forgive those who trespass against us. And lead us not into temptation, but deliver us from evil. Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(4));

		item = new Item();
		item.title = "Our Father Latin";
		item.intro = "";
		item.content = "Pater noster, qui es in caelis: sanctificetur nomen tuum; adveniat regnum tuum;fiat voluntas tua, sicut in caelo, et in terra. Panem nostrum cotidianum da nobis hodie; et dimitte nobis debita nostra, sicut et nos dimtitimus debitóribus nostris; et ne nos inducas in tentatiónem; sed libera nos a malo. Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(5));

		item = new Item();
		item.title = "Hail Mary";
		item.intro = "";
		item.content = "Hail Mary, full of grace. The Lord is with thee. Blessed art thou amongst women, and blessed is the fruit of thy womb, Jesus. Holy Mary, Mother of God, pray for us sinners, now and at the hour of our death, Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(6));

		item = new Item();
		item.title = "Salve Regina";
		item.intro = "";
		item.content = "Hail, Holy Queen, Mother of Mercy, our life, our sweetness and our hope! To thee do we cry, poor banished children of Eve; to thee do we send up our sighs, mourning and weeping in this valley of tears. Turn then, most gracious advocate, thine eyes of mercy toward us, and after this our exile, show unto us the blessed fruit of thy womb, Jesus. O clement, O loving, O sweet Virgin Mary!";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(7));

		item = new Item();
		item.title = "Saint Michael prayer";
		item.intro = "";
		item.content = "Saint Michael, the Archangel, defend us in battle. Be our protection against the wickedness and snares of the devil. May God rebuke him, we humbly pray; and do thou, O Prince of the heavenly host, by the power of God cast into hell Satan and all the evil spirits who prowl throughout the world seeking the ruin of souls. Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(8));

		item = new Item();
		item.title = "Guardian Angel prayer";
		item.intro = "";
		item.content = "Angel of God, my Guardian dear, to whom God's love commits me here, ever this day (or night) be at my side, to light and guard, to rule and guide. Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(9));

		item = new Item();
		item.title = "Child's Guardian Angel prayer";
		item.intro = "";
		item.content = "O Angels of God, from heaven so bright, watching beside my children to lead them aright; Fold your wings round them, and guard them with love; Softly sing songs to them of heaven above. Amen";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(10));

		item = new Item();
		item.title = "The Angelus";
		item.intro = "";
		item.content = "V- The Angel of the Lord declared unto Mary.\nR- And she conceived by the Holy Spirit.\n(Hail Mary....)\nV- Behold the handmaid of the Lord.\nR- Be it done unto me according to thy word.\n(Hail Mary....)\nV- And the Word was made Flesh.\nR- And dwelt among us.\n(Hail Mary....)\nV- Pray for us, O Holy Mother of God.\nR- That we may be made worthy of the promises of Christ.\nLet us pray:\nPour forth, we beseech Thee, O Lord, Thy grace into our hearts; that, we to whom the Incarnation of Christ, Thy Son, was made known by the message of an Angel, may by His Passion and Cross, be brought to the glory of His Resurrection through the same Christ our Lord. Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(11));

		category.addSubCategory(new Integer(2));
		categories.addElement(subCategory);

		subCategory = new Category();
		subCategory.title = "Devotional";
		subCategory.parentId = 1;

		item = new Item();
		item.title = "Prayer of St. Francis de Sales";
		item.intro = "";
		item.content = "O love eternal, my soul needs and chooses you eternally! Ah, come Holy Spirit, and inflame our hearts with your love! To love - or to die! To die - and to love! To die to all other love in order to live in Jesus' love, so that we may not die eternally. But that we may live in your eternal love, O Saviour of our souls, we eternally sing, \"Live, Jesus! Jesus, I love! Live, Jesus, whom I love! Jesus, I love, Jesus who lives and reigns forever and ever.\" Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(12));

		item = new Item();
		item.title = "Morning prayer";
		item.intro = "";
		item.content = "Lord God Almighty, who hast safely brought us to the beginning of this day, defend us in the same by Thy mighty power, that this day we may fall into no sin, but that all our words may so proceed, and all our thoughts and actions may be so directed as to do always that which is just in Thy sight. Through Christ our Lord. Amen";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(13));

		item = new Item();
		item.title = "An Act of Faith";
		item.intro = "";
		item.content = "O my God! I firmly believe that You are one God in three Divine Persons, Father, Son, and Holy Spirit. I believe that Your Divine Son became man and died for our sins, and that He will come to judge the living and the dead. I believe these and all the truths which the holy Catholic Church teaches because You have revealed them, Who can neither deceive nor be deceived.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(14));

		item = new Item();
		item.title = "An Act of Hope";
		item.intro = "";
		item.content = "O my God! relying on Your infinite goodness and promises, I hope to obtain pardon of my sins, the help of Your grace, and life everlasting, through the merits of Jesus Christ, my Lord and Redeemer.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(15));

		item = new Item();
		item.title = "An Act of Love";
		item.intro = "";
		item.content = "O my God! I love You above all things with my whole heart and soul because You are all good and worthy of all love. I love my neighbor as myself for the love of You. I forgive all who have injured me, and ask pardon of all whom I have injured.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(16));

		item = new Item();
		item.title = "Act of Contrition";
		item.intro = "";
		item.content = "O my God, I am sorry and beg pardon for all my sins, and detest them above all things, because they deserve They dreadful punishments, because they have crucified my loving Saviour Jesus Christ and, most of all, becuase they offend Thine infinite goodness; and I firmly resolve, by the help of Thy grace, never to offend Thee again, and carefully to avoid the occasions of sin. Amen";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(17));

		item = new Item();
		item.title = "Prayer for the Sanctification of Labor";
		item.intro = "";
		item.content = "O God, the creator of all things, you framed the law of labor for the human race. Graciously grant, by the example and patronage of St. Joseph, that we may do the work you provide us and earn the reward you promise. Sustain us with your grace to live up to our duties in charity and justice. Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(18));

		category.addSubCategory(new Integer(3));
		categories.addElement(subCategory);

		subCategory = new Category();
		subCategory.title = "Requests";
		subCategory.parentId = 1;

		item = new Item();
		item.title = "Before the study";
		item.intro = "";
		item.content = "Incomprehensible Creator, the true Fountain of light and only Author of all knowledge: deign, we beseech Thee, to enlighten our understanding, and to remove from us all darkness of sin and ignorance. Thou, who makest eloquent the tongues of those who lack utterance, direct our tongues, and pour on our lips the grace of thy blessing. Give us a diligent and obedient spirit, quickness of apprehension, capacity of retaining, and the powerful assistance of Thy holy grace; that what we hear or learn we may apply to Thy honor and the eternal salvation of our own souls. Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(19));

		item = new Item();
		item.title = "Before the travel";
		item.intro = "";
		item.content = "My holy Angel Guardian, ask the Lord to bless the journey which I undertake, that it may profit the health of my soul and body; that I may reach its end, and that, returning safe and sound, I may find my family in good health. Do thou guard, guide and preserve us. Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(20));

		item = new Item();
		item.title = "For wisdom";
		item.intro = "";
		item.content = "Great is the wisdom of the Lord! God Almighty, Your Wisdom includes an understanding of what is fair, what is logical, what is true, what is right and what is lasting. It mirrors Your pure intellect! I entreat You to grant me such wisdom, That my labours may reflect Your insight. Your wisdom expands in Your creations, displaying complexity and multiplicity. Your wisdom is an eternity ahead of man. May Your wisdom flourish forever!";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(21));

		item = new Item();
		item.title = "Serenity prayer";
		item.intro = "";
		item.content = "O God, grant me the serenity to accept the things I cannot change the courage to change the things I can and the wisdom to know the difference. Living one day at a time, enjoying one moment at a time. Accepting hardships as the parthway to peace. Taking, as he did, the sinful world as it is, not as I would have it. Trusting that he will make all things right if I surrender to His will; that I may be reasonably happy in this life, and supremely happy with Him forever. Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(22));

		item = new Item();
		item.title = "For the Church";
		item.intro = "";
		item.content = "We pray You, O almighty and eternal God! Who through Jesus Christ hast revealed Your glory to all nations, to preserve the works of Your mercy, that Your Church, being spread through the whole world, may continue with unchanging faith in the confession of your name. Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(23));

		item = new Item();
		item.title = "Prayer for priests";
		item.intro = "";
		item.content = "O Jesus, I pray for Your faithful and fervent priests; for Your unfaithful and tepid priests; for Your priests labouring at home or abroad in distant mission fields; for Your tempted priests; for Your lonely and desolate priest; for Your young priests; for Your dying priests; for the souls of Your priests in purgatory. But above all I recommend to You the priests dearest to me; the priest who baptized me; the priests who absolved me from my sins; the priests at whose Masses I assisted and who gave me Your Body and Blood in Holy communion; the priests who taught and instructed me; all the priests to whom I am indebted in any other way. O Jesus, keep them all close to Your heart, and bless them abundantly in time and in eternity.Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(24));

		item = new Item();
		item.title = "Prayer for the Dead";
		item.intro = "";
		item.content = "Eternal rest, grant unto them, O Lord, and let perpetual light shine upon them. May the souls of the faithful departed through the mercy of God rest in peace. Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(25));

		item = new Item();
		item.title = "Prayer for the Pope";
		item.intro = "";
		item.content = "Let us pray for our Most Holy Father, Pope Benedict XVI. May the Lord preserve him and give him life, and make him blessed upon the earth, and deliver him not up to the will of his enemies. Amen";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(26));

		item = new Item();
		item.title = "Prayer for Parents";
		item.intro = "";
		item.content = "O Almighty God, you gave us the commandment to honour our father and mother. In your loving kindness hear my prayer for my parents. Give them long lives and keep them well in body and spirit. Bless their labours; keep them always in your care. Bless them generously for their loving care for me. Grant that, through your grace, I may always be their support and comfort, and that, after our life together on earth, we may experience the joy together praising you forever. ";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(27));

		item = new Item();
		item.title = "Prayer for the Sick";
		item.intro = "";
		item.content = "Omnipotent and eternal God, the everlasting Salvation of those who believe, hear us on behalf of Thy sick servant, N., for whom we beg the aid of Thy pitying mercy, that, with his bodily health restored, he may give thanks to Thee in Thy church. Through Christ our Lord. Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(28));

		category.addSubCategory(new Integer(4));
		categories.addElement(subCategory);

		subCategory = new Category();
		subCategory.title = "Catechism";
		subCategory.parentId = 1;

		item = new Item();
		item.title = "The Ten Commandments";
		item.intro = "";
		item.content = "1.I am the Lord your God; you shall not have strange gods before me.\n2.You shall not take the name of the Lord your God in vain.\n3.Remember to keep holy the Lord's day\n4.Honor your father and your mother.\n5.You shall not kill.\n6.You shall not commit adultery.\n7.You shall not steal.\n8.You shall not bear false witness against your neighbor.\n9.You shall not covet your neighbor's wife.\n10.You shall not covet you neighbor's goods.\n";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(29));

		item = new Item();
		item.title = "The Eight Beatitudes";
		item.intro = "";
		item.content = "1.Blessed are the poor in spirit, for theirs is the kingdom of heaven.\n2.Blessed are they who mourn, for they will be comforted.\n3.Blessed are the meek, for they will inherit the land.\n4.Blessed are they who hunger and thirst for righteousness, for they will be satisfied.\n5.Blessed are the merciful, for they will be shown mercy.\n6.Blessed are the clean of heart, for they will see God.\n7.Blessed are the peacemakers, for they will be called children of God.\n8.Blessed are they who are persecuted for the sake of righteousness, for theirs is the kingdom of heaven.\nBlessed are you when they insult you and persecute you and utter every kind of evil against you (falsely) because of me.Rejoice and be glad, for your reward will be great in heaven. Thus they persecuted the prophets who were before you.\n(Matthew 5:3-12)";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(30));

		item = new Item();
		item.title = "The Commandments of the Church";
		item.intro = "";
		item.content = "\n1.To assist at Mass on all Sundays and holy days of obligation.\n2.To fast and abstain on the days appointed.\n3.To confess our sins at least once a year.\n4.To receive Holy Communion during the Easter time.\n5.To contribute to the support of the Church.\n6.To observe the laws of the Church concerning marriage.\n";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(31));

		item = new Item();
		item.title = "Theological virtues";
		item.intro = "";
		item.content = "Faith, Hope, and Love or Charity";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(32));

		item = new Item();
		item.title = "Cardinal virtues";
		item.intro = "";
		item.content = "Prudence, Justice, Restraint or Temperance, and Courage";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(33));

		item = new Item();
		item.title = "Seven deadly sins";
		item.intro = "";
		item.content = "1.Lust\n2.Gluttony\n3.Greed\n4.Sloth\n5.Wrath\n6.Envy\n7.Pride";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(34));

		item = new Item();
		item.title = "Seven virtues";
		item.intro = "";
		item.content = "1.Chastity\n2.Temperance\n3.Charity\n4.Diligence\n5.Patience\n6.Kindness\n7.Humility";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(35));

		item = new Item();
		item.title = "Five Steps for a Good Confession";
		item.intro = "";
		item.content = "1.Examine your conscience thoroughly\n2.Be sincerely sorry for your sins\n3.Confess your sins to the best of your ability\n4.Resolve to amend your life\n5.After your confession, do the penance the priest gives you\n";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(36));

		item = new Item();
		item.title = "The Fruits of the Holy Spirit";
		item.intro = "";
		item.content = "1.Charity (or love)\n2.Joy\n3.Peace\n4.Patience \n5.Benignity (or kindness)\n6.Goodness\n7.Longanimity (or long suffering)\n8.Mildness\n9.Faith\n10.Modesty\n11.Continency\n12.Chastity. ";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(37));

		category.addSubCategory(new Integer(5));
		categories.addElement(subCategory);

		subCategory = new Category();
		subCategory.title = "Others";
		subCategory.parentId = 1;

		item = new Item();
		item.title = "Student's prayer";
		item.intro = "";
		item.content = "Under thy patronage, dear Mother, and calling on the mystery of thine Immaculate Conception, I desire to pursue my studies and my literary labors: I hereby solemnly declare that I am giving myself to these studies chiefly to the following end: that I may the better contribute to the glory of God and to the promotion of thy veneration among men. I pray thee, therefore, most loving Mother, who art the Seat of Wisdom, to bless my labors in thy loving-kindness. Moreover I promise with true affection and a willing spirit, as it is right that I should do, to ascribe all the good that shall come to me therefrom, wholly to thine intercession for me in God's holy presence. Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(38));

		item = new Item();
		item.title = "To St. Maria Goretti";
		item.intro = "";
		item.content = "Oh Saint Maria Goretti who, strengthened by God's grace, did not hesitate even at the age of twelve to shed your blood and sacrifice life itself to defend your virginal purity, look graciously on the unhappy human race which has strayed far from the path of eternal salvation. Teach us all, and especially youth, with what courage and promptitude we should flee for the love of Jesus anything that could offend Him or stain our souls with sin. Obtain for us from our Lord victory in temptation, comfort in the sorrows of life, and the grace which we earnestly beg of thee (here insert intention), and may we one day enjoy with thee the imperishable glory of Heaven. Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(39));

		item = new Item();
		item.title = "To St. Giana Beretta Molla";
		item.intro = "";
		item.content = "O Jesus, I promise You to submit myself to all that You permit to befall me, make me only know Your Will. My most sweet Jesus, infinitely merciful God, most tender Father of  souls, and in a particular way of the most weak, most miserable, most infirm which You carry with special tenderness between Your Divine arms, I come to You to ask You, through the love and merits of Your Sacred  Heart, the grace to comprehend and to do always Your holy Will, the grace to confide in You, the grace to rest securely through time and eternity in Your loving divine arms.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(40));

		item = new Item();
		item.title = "Prayer of married couples";
		item.intro = "";
		item.content = "Lord,we offer You our memory, our mind, our soul, and body. Teach us to love one another and our children with a love that flows from Your merciful heart. Lord Jesus Christ, grant both of us a pure heart modeled on Your own, that our life together may be built upon a prudent and generous love, a love that is devoted, not self-seeking, and stands in defense of Your laws and commandments. May we be aided in this through daily family item, the rosary, the chaplet of Divine Mercy, Holy Mass, and frequent reception of Holy Communion. May we immediately confess every serious sin in the Sacrament of Reconciliation. Lord Jesus, be the one Lord of our life. Teach us to achieve mastery over our sexual drives and feelings, that our love for one another and for our children may not depend on changing moods and states of feeling, but remain constant in its concern and expression of kindness. Grant us a pure conjugal love, that we may make an unselfish gift of ourselves to each other. Cleanse our love of every sign of selfishness, that we may forgive one another, put aside grudges, and pray for each other. To remain pure in heart, we promise never to read, buy, or look at pornographic magazines, programs or films, to avoid artificial contraception, and always to be ready to accept every child with which God should gift us. We ask You, Lord, to help us avoid everything that makes us dependent, that enslaves our will or inclines us to evil. Mary, our Mother lead us along the way of faith, to the very source of Love in our marriage – to Jesus, that we may trust and believe in Him alone. Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(41));

		item = new Item();
		item.title = "Prayer for a Good Husband or Wife";
		item.intro = "";
		item.content = "O Jesus, lover of the young, the dearest Friend I have, in all confidence I open my heart to You to beg Your light and assistance in the important task of planning my future. Give me the light of Your grace, that I may decide wisely concerning the person who is to be my partner through life. Dearest Jesus, send me such a one whom in Your divine wisdom You judge best suited to be united with me in marriage. May her/his character reflect some of the traits of Your own Sacred Heart. May s/he be upright, loyal, pure, sincere and noble, so that with united efforts and with pure and unselfish love we both may strive to perfect ourselves in soul and body, as well as the children it may please You to entrust to our care. Bless our friendship before marriage, that sin may have no part in it. May our mutual love bind us so closely, that our future home may ever be most like Your own at Nazareth.\nO Mary Immaculate, sweet Mother of the young, to your special care I entrust the decision I am to make as to my future wife/husband. You are my guiding Star! Direct me to the person with whom I can best cooperate in doing God's Holy Will, with whom I can live in peace, love and harmony in this life, and attain to eternal joys in the next.Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(42));

		item = new Item();
		item.title = "Grace Before Meals";
		item.intro = "";
		item.content = "Bless us, O Lord, and these Thy gifts, which we are about to receive from Thy bounty, through Christ our Lord. Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(43));

		item = new Item();
		item.title = "Grace After Meals";
		item.intro = "";
		item.content = "We give Thee thanks for all Thy benefits, O Almighty God, who livest and reignest world without end. Amen. May the souls of the faithful departed, through the mercy of God, rest in peace. Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(44));

		item = new Item();
		item.title = "The Holy Rosary";
		item.intro = "";
		item.content = "The Luminous Mysteries  \nThursday\n1. The Baptism in the Jordan\n2. The Wedding at Cana\n3. The Proclamation of the Kingdom\n4. The Transfiguration\n5. The Institution of the Eucharist\n\nThe Joyful Mysteries\nMonday, Saturday\n1. The Annunciation\n2. The Visitation\n3. The Birth of Our Lord\n4. The Presentation of Our Lord\n5. The Finding of Our Lord in the Temple\n\nThe Five Sorrowful Mysteries\nTuesday, Friday\n1. The Agony in the Garden\n2. The Scourging at the Pillar\n3. The Crowning with Thorns\n4. The Carrying of the Cross\n5. The Crucifixion and Death of Our Lord\n\nThe Five Glorious Mysteries\nWednesday, Sunday\n1. The Resurrection\n2. The Ascension\n3. The Coming of the Holy Ghost\n4. The Assumption of our Blessed Mother into Heaven\n5. The Coronation of our Blessed Mother\n";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(45));

		item = new Item();
		item.title = "The Divine Mercy Chaplet";
		item.intro = "";
		item.content = "To be said on the beads of a rosary.\n\"At first: Our Father, Hail Mary, Apostles Creed\nOn the large beads (once): Eternal Father, I offer You the Body and Blood, Soul and Divinity of Your dearly beloved Son, our Lord Jesus Christ, in atonement for our sins and those of the whole world.\nOn the small beads (10 times): For the sake of His sorrowful Passion have mercy on us and on the whole world.\nAt the end (3 times): Holy God, Holy Mighty One, Holy Immortal One, have mercy on us and on the whole world\" (Diary, 476).";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(46));

		item = new Item();
		item.title = "Canticle of St. Francis";
		item.intro = "";
		item.content = "Most High, all-powerful, all-good Lord, All praise is Yours, all glory, all honour and all blessings. To you alone, Most High, do they belong, and no mortal lips are worthy to pronounce Your name. Praised be You my Lord with all Your creatures, especially Sir Brother Sun, Who is the day through whom You give us light. And he is beautiful and radiant with great splendour, Of You Most High, he bears the likeness. Praised be You, my Lord, through Sister Moon and the stars, In the heavens you have made them bright, precious and fair. Praised be You, my Lord, through Brothers Wind and Air, And fair and stormy, all weather's moods, by which You cherish all that You have made. Praised be You my Lord through Sister Water, So useful, humble, precious and pure. Praised be You my Lord through Brother Fire, through whom You light the night and he is beautiful and playful and robust and strong. Praised be You my Lord through our Sister, Mother Earth who sustains and governs us, producing varied fruits with coloured flowers and herbs. Praise be You my Lord through those who grant pardon for love of You and bear sickness and trial. Blessed are those who endure in peace, By You Most High, they will be crowned. Praised be You, my Lord through Sister Death, from whom no-one living can escape. Woe to those who die in mortal sin! Blessed are they She finds doing Your Will. No second death can do them harm. Praise and bless my Lord and give Him thanks, And serve Him with great humility. ";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(47));

		item = new Item();
		item.title = "Magnificat-Canticle of Mary";
		item.intro = "";
		item.content = "My soul magnifies the Lord, And my spirit rejoices in God my Savior. For He has regarded the low estate of His handmaiden, For behold, henceforth all generations shall call me blessed. For He who is mighty has done great things for me, and holy is His name. And His mercy is on those who fear Him from generation to generation. He has shown strength with His arm: He has scattered the proud in the imagination of their hearts. He has put down the mighty from their thrones, and exalted those of low degree. He has filled the hungry with good things; and the rich He has sent empty away. He has helped His servant Israel, in remembrance of His mercy; As He spoke to our fathers, to Abraham and to His posterity forever.\n(Luke 1:46-56)\nGlory be to the Father and to the Son and to the Holy Spirit. As it was in the beginning, is now and ever shall be, world without end. Amen.\n";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(48));

		item = new Item();
		item.title = "Benedictus-Canticle of Zechariah";
		item.intro = "";
		item.content = "\"Blessed be the Lord, the God of Israel, for he has visited and brought redemption to his people. He has raised up a horn for our salvation within the house of David his servant, even as he promised through the mouth of his holy prophets from of old: salvation from our enemies and from the hand of all who hate us, to show mercy to our fathers and to be mindful of his holy covenant and of the oath he swore to Abraham our father, and to grant us that, rescued from the hand of enemies, without fear we might worship him in holiness and righteousness before him all our days. And you, child, will be called prophet of the Most High, for you will go before the Lord to prepare his ways, to give his people knowledge of salvation through the forgiveness of their sins, because of the tender mercy of our God by which the daybreak from on high will visit us to shine on those who sit in darkness and death's shadow, to guide our feet into the path of peace.\"\n(Luke 1:68-79)";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(49));

		category.addSubCategory(new Integer(6));
		categories.addElement(subCategory);

		category = new Category();
		category.title = "Latin";
		category.parentId = 0;

		categories.addElement(category);
		topCategory.addSubCategory(new Integer(7));

		subCategory = new Category();
		subCategory.title = "Primae preces";
		subCategory.parentId = 7;

		item = new Item();
		item.title = "Signum Crucis";
		item.intro = "Intro First";
		item.content = "In nomine Patris, et Filii, et Spiritus Sancti. Amen. ";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(50));

		item = new Item();
		item.title = "Doxologia Minor";
		item.intro = "";
		item.content = "Gloria Patri, et Filio, et Spiritui Sancto. Sicut erat in principio, et nunc, et semper, et in saecula saeculorum. Amen. ";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(51));

		item = new Item();
		item.title = "Oratio Dominica";
		item.intro = "";
		item.content = "Pater noster, qui es in caelis, sanctificetur nomen tuum. Adveniat regnum tuum. Fiat voluntas tua, sicut in caelo et in terra. Panem nostrum quotidianum da nobis hodie, et dimitte nobis debita nostra sicut et nos dimittimus debitoribus nostris. Et ne nos inducas in tentationem, sed libera nos a malo. Amen. ";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(52));

		item = new Item();
		item.title = "Ave Maria";
		item.intro = "";
		item.content = "Ave Maria, gratia plena, Dominus tecum. Benedicta tu in mulieribus, et benedictus fructus ventris tui, Iesus. Sancta Maria, Mater Dei, ora pro nobis peccatoribus, nunc, et in hora mortis nostrae. Amen. ";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(53));

		item = new Item();
		item.title = "Symbolum Apostolorum";
		item.intro = "";
		item.content = "Credo  in Deum Patrem omnipotentem, Creatorem caeli et terrae. Et in Iesum Christum, Filium eius unicum, Dominum nostrum, qui conceptus est de Spiritu Sancto, natus ex Maria Virgine, passus sub Pontio Pilato, crucifixus, mortuus, et sepultus, descendit ad inferos, tertia die resurrexit a mortuis, ascendit ad caelos, sedet ad dexteram Dei Patris omnipotentis, inde venturus est iudicare vivos et mortuos. Credo in Spiritum Sanctum, sanctam Ecclesiam catholicam, sanctorum communionem, remissionem peccatorum, carnis resurrectionem, vitam aeternam. Amen. ";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(54));

		item = new Item();
		item.title = "Angele Dei";
		item.intro = "";
		item.content = "Angele Dei, qui custos es mei, me tibi commissum pietate superna; (Hodie, Hac nocte) illumina, custodi, rege, et guberna. Amen. ";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(55));

		item = new Item();
		item.title = "Benedictio ante mensam";
		item.intro = "";
		item.content = "Benedic, Domine, nos et haec tua dona quae de tua largitate sumus sumpturi. Per Christum Dominum nostrum. Amen. ";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(56));

		item = new Item();
		item.title = "Benedictio post mensam";
		item.intro = "";
		item.content = "Agimus tibi gratias, omnipotens Deus, pro universis beneficiis tuis, qui vivis et regnas in saecula saeculorum. Amen. ";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(57));

		category.addSubCategory(new Integer(8));
		categories.addElement(subCategory);

		subCategory = new Category();
		subCategory.title = "Preces eucharisticae";
		subCategory.parentId = 7;

		item = new Item();
		item.title = "Trium Puerorum";
		item.intro = "Gratiarum actio post missam";
		item.content = "\nTrium puerórum cantémus hymnum, quem cantábant sancti in camíno ignis, benedicéntes Dóminum (T. P. Allelúia).\n\n1. Benedícite, ómnia ópera Dómini, Dómino, laudáte et superexaltáte eum in sæcula.\n2. Benedícite, cæli, Dómino, benedícite, ángeli Dómini, Dómino.\n3. Benedícite, aquæ omnes, quae super cælos sunt, Dómino; benedícat omnis virtus, Dómino.\n4. Benedícite, sol et luna, Dómino; benedícite, stellæ cæli, Dómino.\n5. Benedícite, omnis imber et ros, Dómino; benedícite, omnes venti, Dómino.\n6. Benedícite, ignis et æstus, Dómino; benedícite, frigus et æstus, Domino.\n7. Benedícite, rores et pruína, Dómino; benedícite, gelu et frigus, Domino.\n8. Benedícite, glácies et nives, Dómino; benedícite, noctes et dies, Dómino.\n9. Benedícite, lux et ténebræ, Dómino; benedícite, fúlgura et nubes, Dómino.\n10. Benedícat terra Dóminum, laudet et superexáltet eum in sæcula.\n11. Benedícite montes et colles, Dómino; benedícite, univérsa germinántia in terra, Dómino.\n12. Benedícite, mária et flúmina, Dómino; benedícite, fontes, Dómino.\n13. Benedícite, cete et ómnia, quae movéntur in aquis, Dómino; benedícite, omnes vólucres cæli, Dómino.\n14. Benedícite, omnes béstiae et pécora, Dómino; benedícite, fílii hóminum, Dómino.\n15. Bénedic, Israel, Dómino, laudáte et superexaltáte eum in sæcula.\n16. Benedícite, sacerdótes Dómini, Dómino, benedícite, servi Dómini, Dómino.\n17. Benedícite, spíritus et ánimæ iustórum, Dómino, benedícite, sancti et húmiles corde, Dómino.\n18. Benedícite, Ananía, Azaría, Misael, Dómino, laudáte et superexaltáte eum in sæcula.\n19. Benedicámus Patrem et Fílium cum Sancto Spíritu; laudémus et superexaltémus eum in sæcula.\n20. Benedíctus es in firmamento cæli et laudábilis et gloriósus in sæcula.\n\nHic non dícitur Glória Patri neque Amen\n\nPsalmus CL\n\n1. Laudáte Dóminum in sanctuário eius, laudáte eum in firmaménto virtútis eius.\n2. Laudáte eum in magnálibus eius, laudáte eum secúndum multitúdinem magnitúdinis eius.\n3. Laudáte eum in sono tubæ, laudáte eum in psaltério et cíthara.\n4. Laudáte eum in tympano et choro, laudáte eum in chordis et órgano.\n5. Laudáte eum in cymbalis benesonántibus, laudáte eum in cymbalis iubilatiónis: omne quod spirat, laudet Dóminum.\n\nGlória Patri...\n\nOmnes exsurgunt, et qui preces moderatur dicit:\n\nV. Kyrie, eléison. Christe, eléison. Kyrie, eléison.\n\nPater noster...\n\nV. Et ne nos indúcas in tentatiónem.\nR. Sed líbera nos a malo.\nV. Confiteántur tibi, Dómine, ómnia ópera tua.\nR. Et Sancti tui benedícant tibi.\nV. Exsultábunt sancti in glória.\nR. Letabúntur in cubílibus suis.\nV. Non nobis, Dómine, non nobis.\nR. Sed nómini tuo da glóriam.\nV. Dómine, exáudi orationem meam.\nR. Et clamor meus ad te véniat.\n\nSacerdos addit:\n\nV. Dóminus vobiscum.\nR. Et cum spíritu tuo.\n\nOrémus: Deus, qui tribus púeris mitigásti flammas ígnium, concéde propitius; ut nos fámulos tuos non exúrat flamma vitiórum.\n\nActiónes nostras, quæsumus, Dómine, aspirándo præveni et adiuvándo proséquere: ut cuncta nostra orátio et operátio a te semper incípiat, et per te cœpta finiatur.\n\nDa nobis, quæsumus, Dómine, vitiórum nostrórum flammas extínguere; qui beato Lauréntio tribuísti tormentórum suórum incéndia superáre. Per Christum, Dóminum nostrum.\n\nR. Amen.\n        ";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(58));

		item = new Item();
		item.title = "Adoro te devote";
		item.intro = "";
		item.content = "\nAdóro te, devóte, latens déitas,\nquæ sub his figúris vere latitas.\nTibi se cor meum totum súbiicit,\nquia te contémplans totum déficit.\n\nVisus, tactus, gustus in te fállitur,\nsed audítu solo tuto créditur;\ncredo quidquid dixit Dei Fílius:\nnil hoc verbo veritátis vérius.\n\nIn Cruce latébat sola déitas,\nat hic latet simul et humánitas;\nambo tamen credens atque cónfitens,\npeto quod petívit latro pœnitens.\n\nPlagas, sicut Thómas, non intúeor,\nDeum tamen meum te confíteor;\nfac me tibi semper magis crédere,\nin te spem habére, te dilígere.\n\nO memoriále mortis Dómini!\nPanis vivus, vitam præstans hómini;\npræsta meæ menti de te vívere,\net te illi semper dulce sápere.\n\nPie pellicáne, Iesu Dómine,\nme immúndum munda tuo sánguine:\ncuius una stilla salvum fácere\ntotum mundum quit ab omni scælere.\n\nIesu, quem velátum nunc aspício,\noro, fiat illud quod tam sítio;\nut te reveláta cernens fácie,\nvisu sim beátus tuæ gloriæ.\n\nAmen.\n        ";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(59));

		item = new Item();
		item.title = "Pange, lingua";
		item.intro = "";
		item.content = "\nPange, língua, gloriósi \nCórporis mystérium. \nSanguinísque pretiósi, \nquem in mundi prétium, \nfructus ventris generósi \nRex effúdit géntium.\n\nNobis datus, nobis natus \nex intácta Vírgine, \net in mundo conversátus, \nsparso verbi sémine, \nsui moras incolátus \nmiro cláusit órdine.\n\nIn suprémæ nocte cœnæ, \nrecumbens cum frátribus, \nobserváta lege plene, \ncibis in legálibus, \ncibum turbæ duodénæ \nse dat suis mánibus.\n\nVerbum caro, panem verum, \nVerbo carnem éfficit, \nfitque sanguis Christi merum, \net si sensus déficit, \nad firmándum cor sincérum \nsola fides súfficit.\n\nTantum ergo Sacraméntum \nvenerémur cérnui; \net antíquum documéntum \nnovo cedat rítui; \npræstet fides supplementum \nsénsuum deféctui.\n\nGenitóri, Genitóque \nlaus et iubilátio; \nsalus, honor, virtus quoque \nsit et benedíctio; \nprocedénti ab utróque \ncompar sit laudátio. \nAmen.\n\nOremus\n\nDeus, qui nobis sub Sacraménto mirábili passiónis tuæ memóriam reliquísti, tríbue quæsumus, ita nos Córporis et Sánguinis tui sacra mystéria venerári, ut redemptiónis tuæ fructum in nobis iúgiter sentiámus. Qui vivis et regnas in sæcula sæculorum. Amen.\n       ";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(60));

		category.addSubCategory(new Integer(9));
		categories.addElement(subCategory);

		subCategory = new Category();
		subCategory.title = "Psalmi selecti";
		subCategory.parentId = 7;

		item = new Item();
		item.title = "Psalmus II";
		item.intro = "Quare fremuerunt?";
		item.content = "\nAntiphona: Regnum eius regnum sempitérnum est, et omnes reges sérvient ei et obœdient. (T. P. Allelúia).\n\n1. Quare fremuérunt gentes, et pópuli meditáti sunt inánia?\n2. Astitérunt reges terræ, et príncipes convenérunt in unum advérsus Dóminum et advérsus Christum eius:\n3. «Dirumpámus víncula eórum et proiciámus a nobis iugum ipsórum!».\n4. Qui hábitat in cælis, irridebit eos, Dóminus subsannábit eos.\n5. Tunc loquétur ad eos in ira sua et in furóre suo conturbábit eos.\n6. «Ego autem constítui regem meum super Sion, montem sanctum meum!».\n7. Praedicábo decrétum eius. Dóminus dixit ad me: «Fílius meus es tu; ego hódie génui te.\n8. Póstula a me, et dabo tibi gentes hereditátem tuam et possessiónem tuam términos terræ.\n9. Reges eos in virga férrea et tamquam vas fíguli confrínges eos».\n10. Et nunc, reges, intellégite, erudimini, qui iudicatis terram.\n11. Servíte Dómino in timóre et exsultáte ei cum tremóre.\n12 Apprehéndite disciplinam, ne quando irascátur, et pereátis de via, cum exárserit in brevi ira eius. Beati omnes, qui confídunt in eo.\n13. Glória Patri, et Fílio, et Spirítui Sancto.\n14. Sicut erat in princípio, et nunc, et semper, et in sæcula sæculorum. Amen.\n\nAntíphona: Regnum eius regnum sempitérnum est, et omnes reges sérvient ei et obœdient. (T. P. Allelúia).\n\nV. Dómine, exaudi oratiónem meam.\nR. Et clamor meus ad te véniat.\n\nSacerdotes addunt:\n\nV. Dóminus vobíscum.\nR. Et cum spíritu tuo.\n\nOrémus: Omnípotens sempitérne Deus, qui in dilécto Fílio tuo, universórum Rege, ómnia instauráre voluísti: concéde propítius; ut cunctæ famíliæ géntium, peccáti vúlnere disgregátæ, eius suavíssimo subdántur império: Qui tecum vivit et regnat in unitáte Spíritus Sancti Deus: per ómnia sæcula sæculórum.\nR. Amen.\n        ";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(61));

		item = new Item();
		item.title = "Psalmus XXVI";
		item.intro = "Dominus illuminatio mea";
		item.content = "\nDominus illuminatio mea et salus mea: quem timebo?/ Dominus protector vitae meae:/ a quo trepidabo?/\nDum appropiant super me nocentes ut edant carnes meas,/ qui tribulant me inimici mei,/ ipsi infirmati sunt et ceciderunt./\nSi consistant adversum me castra, non timebit cor meum;/ si exsurgat adversum me praelium, in hoc ego sperabo./\nUnam petii a Domino, hanc requiram,/ ut inhabitem in domo Domini omnibus diebus vitae meae;/ ut videam voluptatem Domini, et visitem templum ejus./\nQuoniam abscondit me in tabernaculo suo;/ in die malorum protexit me in abscondito tabernaculi sui./\nIn petra exaltavit me,/ et nunc exaltavit caput meum super inimicos meos./ Circuivi, et immolavi in tabernaculo ejus hostiam vociferationis;/ cantabo, et psalmum dicam Domino./\nExaudi, Domine, vocem meam, qua clamavi ad te;/ miserere mei, et exaudi me./\nTibi dixit cor meum: Exquisivit te facies mea;/ faciem tuam, Domine, requiram./\nNe avertas faciem tuam a me;/ ne declines in ira a servo tuo./ Adjutor meus esto; ne derelinquas me,/ neque despicias me, Deus salutaris meus./\nQuoniam pater meus et mater mea dereliquerunt me;/ Dominus autem assumpsit me./\nLegem pone mihi, Domine, in via tua,/ et dirige me in semitam rectam, propter inimicos meos./\nNe tradideris me in animas tribulantium me,/ quoniam insurrexerunt in me testes iniqui,/ et mentita est iniquitas sibi./\nCredo videre bona Domini in terra viventium./\nExpecta Dominum, viriliter age:/ et confortetur cor tuum, et sustine Dominum.\n         ";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(62));

		item = new Item();
		item.title = "Psalmus L";
		item.intro = "Miserere mei";
		item.content = "\nMiserére mei, Deus, secúndum misericórdiam tuam.\nEt secúndum multitúdinem miseratiónum tuárum dele iniquitátem meam.\nAmplius lava me ab iniquitáte mea et a peccáto meo munda me.\nQuóniam iniquitátem meam ego cognósco: et peccátum meum contra me est semper.\nTibi, tibi soli peccávi, et malum coram te feci, ut iustus inveniáris in senténtia tua et equus in iudício tuo.\nEcce enim in iniquitáte generatus sum: et in peccáto concépit me mater mea.\nEcce enim veritátem in corde dilexísti: et in occúlto sapiéntiam manifestásti mihi.\nAspérges me hyssópo, et mundábor: lavábis me, et super nivem dealbábor.\nAudíre me fácies gáudium et letítiam, et exsultábunt ossa, quae contrivísti.\nAvérte fáciem tuam a peccátis meis et omnes iniquitátes meas dele.\nCor mundum crea in me, Deus, et spíritum firmum ínnova in viscéribus meis.\nNe proícias me a fácie tua et spíritum sanctum tuum ne áuferas a me.\nRedde mihi lætítiam salutáris tui et spíritu promptíssimo confirma me.\nDocébo iníquos vias tuas, et ímpii ad te converténtur.\nLíbera me de sanguínibus, Deus, Deus salútis meæ, et exsultábit língua mea iustítiam tuam.\nDómine, lábia mea apéries, et os meum annuntiábit laudem tuam.\nNon enim sacrifício delectáris; holocáustum, si ófferam, non placebit.\nSacrifícium Deo spíritus contribulátus; cor contrítum, et humiliátum, Deus, non despícies.\nBenígne fac, Dómine, in bona voluntáte tua Sion, ut ædificéntur muri Ierúsalem.\nTunc acceptábis sacrifícium iustítiæ, oblatiónes et holocáusta: tunc impónent super altáre tuum vítulos.\n        ";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(63));

		category.addSubCategory(new Integer(10));
		categories.addElement(subCategory);

		subCategory = new Category();
		subCategory.title = "Preces marianae";
		subCategory.parentId = 7;

		item = new Item();
		item.title = "Salve Regina";
		item.intro = "";
		item.content = "Salve, Regina, mater misericordiae, vita, dulcedo, et spes nostra, salve. Ad te clamamus exsules filii Hevae. Ad te suspiramus, gementes et flentes in hac lacrimarum valle. Eia, ergo, advocata nostra, illos tuos misericordes oculos ad nos converte. Et Iesum, benedictum fructum ventris tui, nobis post hoc exsilium ostende. O clemens, O pia, O dulcis Virgo Maria. Amen. ";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(64));

		item = new Item();
		item.title = "Regina Caeli";
		item.intro = "";
		item.content = "Regina, caeli, laetare, alleluia:\nQuia quem meruisti portare, alleluia,\nResurrexit sicut dixit, alleluia.\nOra pro nobis Deum, alleluia. \nV. Gaude et laetare, Virgo Maria, alleluia,\nR. Quia surrexit Dominus vere, alleluia. \nOremus\nDeus, qui per resurrectionem Filii tui, Domini nostri Iesu Christi, mundum laetificare dignatus es: praesta, quaesumus; ut, per eius Genetricem Virginem Mariam, perpetuae capiamus gaudia vitae. Per eundem Christum Dominum nostrum. Amen. ";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(65));

		item = new Item();
		item.title = "Maria, Mater Gratiae";
		item.intro = "";
		item.content = "Maria, Mater gratiae,\nMater misericordiae,\ntu me ab hoste protege\net hora mortis suscipe.\nAmen. ";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(66));

		item = new Item();
		item.title = "Memorare, O piissima Virgo Maria";
		item.intro = "";
		item.content = "Memorare, O piissima Virgo Maria, non esse auditum a saeculo, quemquam ad tua currentem praesidia, tua implorantem auxilia, tua petentem suffragia, esse derelictum. Ego tali animatus confidentia, ad te, Virgo Virginum, Mater, curro, ad te venio, coram te gemens peccator assisto. Noli, Mater Verbi, verba mea despicere; sed audi propitia et exaudi. Amen. ";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(67));

		item = new Item();
		item.title = "Sub Tuum Praesidium";
		item.intro = "";
		item.content = "Sub tuum praesidium confugimus, Sancta Dei Genetrix. Nostras deprecationes ne despicias in necessitatibus1, sed a periculis cunctis libera nos semper, Virgo gloriosa et benedicta. Amen. ";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(68));

		category.addSubCategory(new Integer(11));
		categories.addElement(subCategory);

		subCategory = new Category();
		subCategory.title = "Hymna";
		subCategory.parentId = 7;

		item = new Item();
		item.title = "Te Deum";
		item.intro = "";
		item.content = "Te Deum laudamus:\nte Dominum confitemur.\nTe aeternum Patrem\nomnis terra veneratur.\nTibi omnes Angeli;\ntibi caeli et universae Potestates;\nTibi Cherubim et Seraphim\nincessabili voce proclamant:\nSanctus, Sanctus, Sanctus, Dominus\nDeus Sabaoth.\nPleni sunt caeli et terra\nmaiestatis gloriae tuae.\nTe gloriosus Apostolorum chorus,\nTe Prophetarum laudabilis numerus,\nTe Martyrum candidatus laudat exercitus.\nTe per orbem terrarum\nsancta confitetur Ecclesia,\nPatrem immensae maiestatis:\nVenerandum tuum verum\net unicum Filium;\nSanctum quoque\nParaclitum Spiritum.\nTu Rex gloriae, Christe.\nTu Patris sempiternus es Filius.\nTu ad liberandum suscepturus\nhominem,\nnon horruisti Virginis uterum.\nTu, devicto mortis aculeo, aperuisti\ncredentibus regna caelorum.\nTu ad dexteram Dei sedes,\nin gloria Patris.\nIudex crederis esse venturus.\nTe ergo quaesumus, tuis famulis subveni:\nquos pretioso sanguine redemisti.\nÆterna fac cum sanctis tuis in gloria numerari.\nSalvum fac populum tuum,\nDomine, et benedic hereditati tuæ.\nEt rege eos, et extolle illos usque in æternum.\nPer singulos dies benedicimus te;\nEt laudamus Nomen tuum in sæculum,\net in sæculum sæculi.\nDignare, Domine, die isto sine peccato nos custodire.\nMiserere nostri domine, miserere nostri.\nFiat misericordia tua,\nDomine, super nos,\nquemadmodum speravimus in te.\nIn te, Domine, speravi:\nnon confundar in æternum.\nV. Benedicamus Patrem, et Filium, cum Sancto Spiritu.\nR. Laudemus, et superexaltemus eum in sæcula.\nV. Benedictus es, Domine, in firmamento cæli.\nR. Et laudabilis, et gloriosus, et superexaltatus in sæcula.\nV. Domine, exaudis orationem mean.\nR. Et clamor meus ad te veniat.\nV. Dominus vobiscum.\nR. Et cum spiritu tuo.\nOremus. Deus, cujus misericordiæ non est numerus, et bonitatis infinitus est thesaurus: + piissimæ maiestati tuæ pro collatis donis gratias agimus, tuam semper clementiam exorantes; * ut, qui petentibus postulata concedis, eosdem non deserens, ad præmia futura disponas. Per Christum Dominum nostrum.\n Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(69));

		item = new Item();
		item.title = "Veni, Creator Spiritus";
		item.intro = "";
		item.content = "Veni, Creator Spiritus,\nmentes tuorum visita,\nimple superna gratia\nquae tu creasti pectora. \nQui diceris Paraclitus,\naltissimi donum Dei,\nfons vivus, ignis, caritas,\net spiritalis unctio. \nTu, septiformis munere,\ndigitus paternae dexterae,\nTu rite promissum Patris,\nsermone ditans guttura. \nAccende lumen sensibus:\ninfunde amorem cordibus:\ninfirma nostri corporis\nvirtute firmans perpeti. \nHostem repellas longius,\npacemque dones protinus:\nductore sic te praevio\nvitemus omne noxium. \nPer te sciamus da Patrem,\nnoscamus atque Filium;\nTeque utriusque Spiritum\ncredamus omni tempore. \nDeo Patri sit gloria,\net Filio, qui a mortuis\nsurrexit, ac Paraclito,\nin saeculorum saecula.\nAmen. \n";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(70));

		item = new Item();
		item.title = "Veni, Sancte Spiritus";
		item.intro = "";
		item.content = "Veni, Sancte Spiritus,\net emitte caelitus\nlucis tuae radium. \nVeni, pater pauperum,\nveni, dator munerum\nveni, lumen cordium. \nConsolator optime,\ndulcis hospes animae,\ndulce refrigerium. \nIn labore requies,\nin aestu temperies\nin fletu solatium. \nO lux beatissima,\nreple cordis intima\ntuorum fidelium. \nSine tuo numine,\nnihil est in homine,\nnihil est innoxium. \nLava quod est sordidum,\nriga quod est aridum,\nsana quod est saucium. \nFlecte quod est rigidum,\nfove quod est frigidum,\nrege quod est devium. \nDa tuis fidelibus,\nin te confidentibus,\nsacrum septenarium. \nDa virtutis meritum,\nda salutis exitum,\nda perenne gaudium,\nAmen, Alleluia.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(71));

		item = new Item();
		item.title = "Ubi caritas";
		item.intro = "";
		item.content = "Ubi caritas et amor, Deus ibi est.\nCongregavit nos in unum Christi amor.\nExultemus, et in ipso iucundemur.\nTimeamus, et amemus Deum vivum.\nEt ex corde diligamus nos sincero. \nUbi caritas et amor, Deus ibi est.\nSimul ergo cum in unum congregamur:\nNe nos mente dividamur, caveamus.\nCessent iurgia maligna, cessent lites.\nEt in medio nostri sit Christus Deus. \nUbi caritas et amor, Deus ibi est.\nSimul quoque cum beatis videamus,\nGlorianter vultum tuum, Christe Deus:\nGaudium quod est immensum, atque probum,\nSaecula per infinita saeculorum. Amen. ";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(72));

		category.addSubCategory(new Integer(12));
		categories.addElement(subCategory);

		subCategory = new Category();
		subCategory.title = "Ad Sanctos";
		subCategory.parentId = 7;

		item = new Item();
		item.title = "Ad te Beate Ioseph";
		item.intro = "";
		item.content = "Ad  te beate Ioseph, in tribulatione nostra confugimus, atque, implorato Sponsae tuae sanctissimae auxilio, patrocinium quoque tuum fidenter exposcimus. Per eam, quaesumus quae te cum immaculata Virgine Dei Genetrice coniunxit, caritatem, perque paternum, quo Puerum Iesum amplexus es, amorem, supplices deprecamur, ut ad hereditatem, quam Iesus Christus acquisivit Sanguine suo, benignus respicias, ac necessitatibus nostris tua virtute et ope succurras. Tuere, o Custos providentissime divinae Familiae, Iesu Christi subolem electam; prohibe a nobis, amantissime Pater, omnem errorum ac corruptelarum luem; propitius nobis, sospitator noster fortissime, in hoc cum potestate tenebrarum certamine e caelo adesto; et sicut olim Puerum Iesum e summo eripuisti vitae discrimine, ita nunc Ecclesiam sanctam Dei ab hostilibus insidiis atque ab omni adversitate defende: nosque singulos perpetuo tege patrocinio, ut ad tui exemplar et ope tua suffulti, sancte vivere, pie emori, sempiternamque in caelis beatitudinem assequi possimus. Amen. ";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(73));

		item = new Item();
		item.title = "Oratio ad Sanctum Michael";
		item.intro = "";
		item.content = "Sancte  Michael Archangele, defende nos in proelio, contra nequitiam et insidias diaboli esto praesidium. Imperet illi Deus, supplices deprecamur: tuque, Princeps militiae caelestis, Satanam aliosque spiritus malignos, qui ad perditionem animarum pervagantur in mundo, divina virtute, in infernum detrude. Amen. ";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(74));

		item = new Item();
		item.title = "O fortitudo Dei";
		item.intro = "";
		item.content = "O fortitudo  Dei, sancte Gabriel, qui virgini Mariae incarnationem unigeniti Filii Dei annuntiasti, laudo et veneror te, o electe Spiritus, et supplex oro, ut meus apud Iesum Christum, Salvatorem nostrum, et eius benedictam matrem advocatus esse, atque in omnibus angustiis me solari et corroborare velis, ne ullis unquam tentationibus superatus, Deum meum peccato offendam. Amen. ";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(75));

		item = new Item();
		item.title = "Ad Sanctum Raphaelem Archangelum";
		item.intro = "";
		item.content = "Dirigere  dignare, Domine Deus, in adiutorium nostrum, sanctum Raphaelem Archangelum; et quem tuae maiestati semper assistere credimus, tibi nostras exiguas preces benedicendas assignet. Per Christum Dominum nostrum. Amen. ";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(76));

		item = new Item();
		item.title = "Commemoratio Sancti Antonii";
		item.intro = "";
		item.content = "O Doctor optime, Ecclesiae sanctae lumen, beate Antoni, divinae legis amator, deprecare pro nobis Filium Dei. \nV. Iustum deduxit Dominus per vias rectas.\nR. Et ostendit illi regnum Dei. \nOremus:\nEcclesiam tuam, Deus, beati Antonii Confessoris tui atque Doctoris sollemnitas votiva laetificet: ut spiritualibus semper muniatur auxiliis, et gaudiis perfrui mereatur aeternis. Per Dominum Iesum Christum.\nR. Amen. ";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(77));

		category.addSubCategory(new Integer(13));
		categories.addElement(subCategory);

		subCategory = new Category();
		subCategory.title = "Pro defunctis";
		subCategory.parentId = 7;

		item = new Item();
		item.title = "Responsum";
		item.intro = "";
		item.content = "V. Ne recordéris peccáta mea, Dómine.\nR. Dum véneris iudicáre sæculum per ignem.\nV. Dírige, Dómine, Deus meus, in conspéctu tuo viam meam.\nR. Dum véneris iudicáre sæculum per ignem.\nV. Réquiem ætérnam dona ei (eis), Dómine, et lux perpétua lúceat ei (eis) .\nR. Dum véneris iudicáre sæculum per ignem.\n\nKyrie, eléison, Christe, eléison. Kyrie, eléison.\n\nPater noster...\n\nV. A porta ínferi.\nR. Erue, Dómine, ánimam eius (ánimas eórum).\nV. Requiescat (requiescant) in pace.\nR. Amen.\n\nV. Dómine, exáudi oratiónem meam.\nR. Et clámor meus ad te véniat.\nV. Dóminus vobíscum.\nR. Et cum spíritu túo.\n\nOrémus: Absólve, quæsumus, Dómine, ánimam fámuli tui N. (fámulæ tuæ N.) ab omni vínculo delictórum: ut, in resurrectiónis glória, ínter Sanctos et eléctos tuos resuscitata respíret. Per Chrístum Dóminum nostrum.\n\nR. Amen.\nV. Réquiem ætémam dona ei (eis), Dómine.\nR. Et lux perpétua lúceat ei (eis).\nV. Requiescat (requiescant) in pace.\nR. Amen.\n\nV. Anima eius (ánimæ eórum) et ánimæ ómnium fidélium defunctórum per misericórdiam Dei requiéscant in pace.\nR. Amen.\n";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(78));

		item = new Item();
		item.title = "Pro parentibus defunctis";
		item.intro = "";
		item.content = "Orémus: Deus, qui nos patrem et matrem honoráre praecepísti: miserere clementer animábus paréntum nostrórum, eorúmque peccáta dimítte; nosque eos in ætérnæ claritátis gáudio fac vidére. Per Chrístum Dóminum nóstrum.\nR. Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(79));

		item = new Item();
		item.title = "Pro omnibus defunctis";
		item.intro = "";
		item.content = "Oremus: Fidélium, Deus, ómnium cónditor et redémptor, animábus famulórum famularúmque tuárum remissiónem cunctórum tríbue peccatórum: ut indulgéntiam, quam semper optavérunt, píis supplicatiónibus consequántur. Per Chrístum Dóminum nóstrum.\nR. Amen.\n";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(80));

		category.addSubCategory(new Integer(14));
		categories.addElement(subCategory);

		category = new Category();
		category.title = "Français";
		category.parentId = 0;

		categories.addElement(category);
		topCategory.addSubCategory(new Integer(15));

		subCategory = new Category();
		subCategory.title = "Prières élémentaires";
		subCategory.parentId = 15;

		item = new Item();
		item.title = "Signe de Croix";
		item.intro = "";
		item.content = "Au nom du père,\nEt du Fils,\nEt du Saint-Esprit.\nAmen";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(81));

		item = new Item();
		item.title = "Gloire au Père";
		item.intro = "";
		item.content = "Gloire au Père et au Fils at au Saint-Esprit. Comme il était au commencement, maintenant et toujours, et dans les siècles des siècles. \nAmen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(82));

		item = new Item();
		item.title = "Credo - Symbole de Nicée-Constantinople";
		item.intro = "";
		item.content = "Je crois en un seul Dieu, le Père tout-puissant,\nCréateur du ciel et de la terre,\nde l'univers visible et invisible.\nJe crois en un seul Seigneur,\nJésus Christ, le Fils unique de Dieu,\nné du Père avant tous les siècles :\nIl est Dieu, né de Dieu, lumière, née de la lumière,\nvrai Dieu, né du vrai Dieu,\nengendré, non pas créé, de même nature que le Père,\net par lui tout a été fait.\nPour nous les hommes, et pour notre salut,\nil descendit du ciel ;\npar l'Esprit Saint,\nil a pris chair de la Vierge Marie,\net s'est fait homme.\nCrucifié pour nous sous Ponce Pilate,\nil souffrit sa passion et fut mis au tombeau.\nIl ressuscita le troisème jour,\ncomformément aux Ecritures,\net il monta au ciel ;\nil est assis à la droite du Père.\nIl reviendra dans la gloire,\npour juger les vivants et les morts ;\net son règne n'aura pas de fin.\nJe crois en l'Esprit Saint,\nqui est Seigneur et qui donne la vie ;\nil procède du Père et du Fils ;\navec le Père et le Fils,\nil reçoit même adoration et même gloire ;\nil a parlé par les prophètes.\nJe crois en l'Eglise,\nune, sainte, catholique et apostolique.\nJe reconnais un seul baptême pour le pardon des péchés.\nJ'attends la résurrection des morts \net la vie du monde à venir.\n\nAmen";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(83));

		item = new Item();
		item.title = "Credo - Symbole des Apôtres";
		item.intro = "\n";
		item.content = "Je crois en Dieu le Père tout-puissant,\nCréateur du ciel et de la Terre,\nEt en Jésus Christ, son Fils unique, notre Seigneur\nqui a été conçu du Saint Esprit,\nest né de la Vierge Marie,\na souffert pour nous sous Ponce Pilate,\na été crucifié, est mort et à été enseveli,\nest descendu aux enfers,\nest ressuscité des morts le troisième jour,\nest monté aux Cieux,\nest assis à la droite de Dieu le Père, tout-puissant\nd'où il viendra juger les vivants et les morts\nJe crois en l'Esprit Saint,\nà la sainte Eglise Catholique,\nà la Communion des Saints,\nà la rémission des péchés,\nà la résurrection de la chair,\net à la Vie Eternelle.\n\nAmen";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(84));

		item = new Item();
		item.title = "Notre Père";
		item.intro = "";
		item.content = "Notre Père, qui êtes aux Cieux, \nQue ton nom soit sanctifié, \nQue ton règne vienne, \nQue ta volonté soit faite, sur la Terre comme au Ciel.\nDonne-nous aujourd'hui notre pain de ce jour, \nPardonne-nous nos offenses, comme nous pardonnons aussi à ceux qui nous ont offensés, \nEt ne nous soumets pas à la tentation, \nMais délivre-nous du mal. \nAmen";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(85));

		item = new Item();
		item.title = "Je vous salue Marie";
		item.intro = "";
		item.content = "Je vous salue, Marie, pleine de grâces\nLe Seigneur est avec vous\nVous êtes bénie entre toutes les femmes\nEt Jésus, le fruit de vos entrailles, est béni. \nSainte Marie, Mère de Dieu, priez pour nous, pauvres pécheurs\nMaintenant, et à l'heure de notre mort. \nAmen";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(86));

		item = new Item();
		item.title = "Salve Regina (Litanies de Lorette)";
		item.intro = "";
		item.content = "Salut, ô Reine, mère de miséricorde: notre vie, notre douceur et notre espérance, salut!\nEnfants d'Ève, exilés, nous crions vers toi; vers toi, nous soupirons, gémissant et pleurant dans cette vallée de larmes.\nÔ toi, notre avocate, tourne vers nous ton regard miséricordieux. Et après cet exil, montre-nous Jésus, le fruit béni de tes entrailles, ô clémente, ô miséricordieuse, ô douce Vierge Marie!";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(87));

		item = new Item();
		item.title = "Prière à l'Archange Saint-Michel";
		item.intro = "";
		item.content = "Saint-Michel Archange \nDéfendez-nous dans le combat. \nSoyez notre secours contre la malice et les embûches du démon. \nQue Dieu exerce sur lui son empire, \nNous vous le demandons en suppliant. \nEt vous, prince de la milice céleste, \nPar la vertu divine, précipitez en enfer, Satan et les autres esprits mauvais qui errent dans le monde pour la perte des âmes.\nAmen";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(88));

		item = new Item();
		item.title = "Je confesse à Dieu";
		item.intro = "";
		item.content = "Je confesse à Dieu tout-puissant,\nje reconnais devant mes frères\nque j'ai péché en pensée, en parole,\npar action et par omission.\nOui, J'ai vraiment péché.\nC'est pourquoi je supplie\nla bienheureuse Vierge Marie,\nles anges et tous les saints,\net vous aussi mes frères,\nde prier pour moi le Seigneur notre Dieu.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(89));

		item = new Item();
		item.title = "Prière à l'ange gardien";
		item.intro = "";
		item.content = "O saint ange gardien,\nque Dieu par un effet de sa bonté pour moi,\na chargé du soin de ma conduite,\nvous qui m'assistez dans mes besoins,\nqui me consolez dans mes peines,\nqui me soutenez dans mes découragements,\net qui m'obtenez sans cesse de nouvelles faveurs,\nje vous en remercie,\net je vous conjure, aimable protecteur,\nde continuer à m'aider,\nde me défendre contre tous mes ennemis,\nd'éloigner de moi les occasions de péché,\nde m'obtenir que je sois docile\nà écouter vos inspirations\net fidèle à les suivre,\nde me protéger surtout à l'heure de la mort,\net de ne pas me quitter\nque vous ne m'ayez conduit\nau séjour du repos éternel.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(90));

		category.addSubCategory(new Integer(16));
		categories.addElement(subCategory);

		subCategory = new Category();
		subCategory.title = "Prières à Jésus";
		subCategory.parentId = 15;

		item = new Item();
		item.title = "Christ glorieux";
		item.intro = "Prière de Teilhard de Chardin";
		item.content = "Christ glorieux,\ntu es le Centre éblouissant\noù se relient les fibres\nsans nombre du multiple.\nTes mains emprisonnent les étoiles.\nTu es le premier er le dernier,\nle vivant, le mort et le ressuscité.\nTu rassembles en ton unité\ntoutes les forces, tous les états,\nc'est toi que j'appelle\nd'un désir aussi vaste que l'univers :\ntu es vraiment mon Seigneur et mon Dieu !";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(91));

		item = new Item();
		item.title = "Coeur de Jésus";
		item.intro = "";
		item.content = "O Coeur Divin, source des vrais plaisirs,\ntant que mon sang coulera dans mes veines\nton feu d'Amour embellira mes peines\net tes bienfaits charmeront mes plaisirs.\nOui, sur mon front, une couronne d'or\nme plaisait moins que ta douce présence.\nHôte Divin, appui de l innocence,\noù trouverai-je un si riche trésor.\nAutour de Toi, si les vertus en pleurs\nont si longtemps invoqué Ta clémence,\nquel plus beau jour pour la reconnaissance\nquand Ton amour uni à tous les coeurs";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(92));

		item = new Item();
		item.title = "Coeur eucharistique";
		item.intro = "Frère Urbain Beauvais";
		item.content = "Coeur eucharistique de Jésus,\nsois la lumière de mon intelligence,\nla force de ma volonté,\nla pureté et la joie de mon coeur,\nla nourriture de mon âme,\nle contrôle de mon imagination\nla fraîcheur de ma mémoire,\nla santé de mon corps,\nl'ardeur de mon zèle,\nmon oraison perpétuelle devant ton Père.\n\nCoeur eucharistique de Jésus,\npardonnez-nous nos péchés\net soyez notre Roi !";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(93));

		item = new Item();
		item.title = "Consécration à L' Enfant Jésus";
		item.intro = "";
		item.content = "O très doux Enfant Jésus,\nqui vous êtes si libéralement\ndonné à moi par votre naissance,\nje me prosterne aujourd'hui à vos pieds,\nsous la protection de la Sainte Vierge\net Saint Joseph;\nje vous consacre mon coeur, mon âme\net tout moi même\npour vous servir sans aucune réserve.\n\nAh! mon Sauveur,\nque n'ai-je un coeur plus grand\npour vous aimer davantage!\nMais je m'associerai d'autres coeurs,\nje veux que d'autres vous aiment autant que moi,\nque d'autres vous servent,\nque d'autres vous honorent.\nQue ne puis-je inspirer à tous les coeurs\nla dévotion à votre Enfance adorable !\n\nDaignez, Ô Saint Enfant Jésus,\nfaire éprouver, à tous vos associés,\nla toute-puissance de votre petitesse,\net que votre divine pureté,\nvotre simplicité et votre innocence\ndécoulent sur tous ceux qui vous rendront hommage.\n\nAinsi soit-il.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(94));

		item = new Item();
		item.title = "Emmaüs";
		item.intro = "";
		item.content = "O Christ Jésus,\nla route est devant nous, tortueuse, incertaine.\nIl nous faut cependant céder à son appel,\nquels que soient nos états d'âme.\n\nQu'avons-nous laissé derrière nous ?\nNos ferveurs, nos rêves, nos impuissances ?\nIl est difficile de tourner la page\nquand un événement vous a secoué.\nNous voudrions tant faire durer l'excitation\net la mobilisation d'un moment.\nMais il nous faut apprendre le travail de deuil\net revenir chez soi, et revenir sur soi.\n\nHeureux sommes-nous\nsi nous ne sommes pas seuls dans notre marche\net pouvons échanger avec un compagnon de route,\nquitte à élever le ton de temps à autre.\nLa solitude peut être une épreuve trop lourde\nà porter au temps de l'individu-roi.\nLa parole échangée nous allège\net rend la route plus familière.\nNous nous comptons par deux\nalors qu'il faut nous dénombrer trois.\nEn effet tu n'es jamais absent de nos rencontres,\ntu habites chacun de nos dialogues\npour les ouvrir à la réalité.\nTu es la Parole à l'origine de toute parole.\n\nO viens Seigneur Jésus,\nt'introduire dans nos face-à-face,\nviens nous obliger à creuser la signification\nde ce qui nous arrive,\net à donner de l'élan à nos vies.\nNous croyons avoir tout compris.\nIl nous manque la clef de ta venue\net de ton accompagnement\npour remettre de l'ordre dans nos mémoires,\ninterpréter l'histoire passée et présente,\net laisser la Parole brûler nos vies.\n\nTa Parole, il faut bien l'avouer,\nn'est pas surgissement de pure nouveauté.\nelle a été burinée grâce à des siècles de foi et d'attente\npar le plus petit des peuples.\nElle s'inscrit dans une succession de gestes prophétiques\ntoujours soucieux de la grandeur de Dieu\net de la dignité de l'homme.\nMais voilà, tu es plus qu'un prophète parmi d'autres,\nplus qu'un messie cristallisant l'espoir des nations.\nTu viens de Dieu et tu retournes à Dieu\nen traversant toute l'épaisseur de la condition humaine,\njusqu'à être conduit à une mort ignominieuse.\nCependant, cette mort n'a pu te retenir\nentre ses mains glacées.\nAu creux de notre nuit,\nla nouvelle de ta résurrection n'en finit pas\nde nous éblouir : tu es vivant,\net toute vie trouve en toi sa source\net son accomplissement,\nson sens et sa fécondité.\n\nAlors que tu as tant à faire sur les routes humaines,\npassant considérable,\naccepte de partager notre gîte et notre couvert.\nNous avons faim de parole et de pain,\net plus encore du ciel sur la terre.\nRefais pour nous les gestes du don et de la communion.\nApprends-nous à devenir nourrissant pour les autres\ncomme toi-même l'es pour tous.\nFais-nous comprendre qu'en rejoignant\nla communauté des disciples\nnous n'avons plus à nous inquiéter de ton absence\nE qu'en rejoignant la communauté des hommes\nNous sommes nous-mêmes responsable de ta présence.\n\nLa route est tortueuse, incertaine.\nPourtant elle est jalonnée des signes ténus et efficaces\nqui nous remettent à ta suite,\nréveillés de nos engourdissements\net désenclavés de nous-mêmes.\nDonne-nous le souffle pour courir\nporter la nouvelle à nos frères,\njusqu'à cette Jérusalem céleste\nqui vient à notre rencontre\npour rassembler les pèlerins\nde tous les peuples et de toutes les religions.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(95));

		item = new Item();
		item.title = "Emplis mon coeur des Béatitudes";
		item.intro = "J.F. Laurent";
		item.content = "Seigneur Jésus,\nemplis mon coeur des Béatitudes,\ncrée en moi un coeur de pauvre,\nun coeur ouvert pour recevoir et pour donner.\n\nCrée en moi un coeur débordant de tendresse,\ntout revêtu de Ton pardon\npour en couvrir les autres.\n\nDonne-moi un regard simple et bon\nqui s'éclaire à tout regard d'enfant.\n\nDonne-moi un coeur de paix qui rassure mes frères,\nun coeur généreux prêt à se battre\npour toutes les grandes causes de l'Homme\net celles du Royaume des cieux.\n\nSeigneur Jésus, Transparence du Père,\ndonne-moi un coeur de chair\nirradié de Ton Esprit d'Amour.\nSeigneur Jésus, emplis mon coeur de Ta joie...\n\nAmen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(96));

		item = new Item();
		item.title = "Etonnement d'un amour";
		item.intro = "Frère Roger de Taizé";
		item.content = "Toi, le Christ,\ntu offres un trésor d'Evangile,\ntu déposes en nous un don unique,\ncelui d'être porteurs de ta vie.\nMais pour qu'il soit évident\nque le rayonnement vienne de toi\net non pas de nous,\ntu as déposé ce don irremplaçable\ndans des vases d'argile,\ndans des coeurs de pauvres,\ntu viens prendre place\ndans la fragilité de nos êtres,\nlà et non pas ailleurs.\nAlors, sans que nous sachions comment,\ntu fais de nous, si démunis et vulnérables,\nle rayonnement de ta présence\nparmi les humains.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(97));

		item = new Item();
		item.title = "Hymne à la Sainte Face";
		item.intro = "Sœur Thérèse-Bénédicte de la Croix";
		item.content = "Toi qui as aimé les tiens\ncomme jamais aucun homme n'a aimé sur cette terre,\nTu nous as fait, en quittant la terre,\nla promesse consolante\nde rester avec nous jusqu'à la fin des temps.\n\nMaintenant Tu habites caché au milieu de nous.\nEn tous temps et en tous lieux se déversent hors de ta tente\nconsolation, lumière et force dans les âmes ici-bas\nqui se réfugient auprès de Toi.\nElles regardent avec amour vers la petite hostie,\nimage silencieuse de la pureté et de la paix.\nPourtant, dans le coeur de ceux qui T'aiment,\njamais ne se tait le désir ardent de Te voir en personne,\nToi, le plus beau de tous les enfants des hommes,\ndans ta forme corporelle. (...)\n\nEt maintenant, en ces derniers temps,\nalors que la foi, l'espérance et l'amour ont disparu,\nTu as découvert ta Sainte Face,\nla Face de celui qui souffrit sur la Croix\net ferma les yeux dans le sommeil de la mort.\n\nComme derrière un voile nous voyons la souffrance\ndans ces traits saints, sublimes.\nCette souffrance - dépassant toute mesure humaine -\nest si grande que nous ne pouvons\nni la saisir ni la pénétrer.\nPourtant Tu souffris silencieux\net en Toi était une force qui maîtrisait l'excès de la souffrance.\nTu étais son Seigneur lorsque Tu Te livrais à elle.\nUne paix insondable et profonde coule de ces traits et dit :\nTout est accompli.\n\nSur celui à qui Tu T'unis éternellement\nTu jettes le mystérieux voile :\nil supporte avec Toi Ta souffrance et souffre comme Toi,\ncaché, silencieux et profondément en paix.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(98));

		item = new Item();
		item.title = "J'ai reçu le Dieu Vivant";
		item.intro = "";
		item.content = "Seigneur Jésus,\n je viens de recevoir Ton Corps glorieux.\nJe T'ai dit juste avant que j'étais indigne de Te recevoir.\nMais comme le centurion romain j'ai ajouté,\nDis seulement une parole et je serai guéri.\n\nTu m'as dit, et je l'ai entendu:\nPaix mon enfant, Ta foi t'a sauvé.\nJe sais que c'est Toi qui fais le ménage en mon âme\npour que mon humble demeure soit digne de Toi.\nNettoie d'un revers de Ta miséricorde\nles moindres recoins de mon âme.\n\nMerci, Seigneur pour le pardon tant de fois accordé.\nEntre Seigneur, Installe-toi, Fais comme chez Toi.\nAu passage, puisque ton corps glorieux est en contact\navec mon corps misérable et mortel,\nguéris-moi. Guéris les moindres cellules de mon corps. Rends-moi fort et vigoureux pour Te servir encore longtemps.\n\nPuique Tu es la Vie, répands Ta Vie en moi.\nPurifie mon corps et mon âme pour que je vive de Ta Vie.\nPuisque Tu es l'Amour, remplis-moi de Ton Amour,\nPuisque Tu es la Joie, comble-moi de Ta Joie,\nPuisque Tu es mon Espérance,\nque mon coeur déborde d'Espérance.\n\nEnvahis-moi de Ton Amour Seigneur,\nConsume tout reste de péché en mon âme.\nFais de mon coeur un trône à Ta gloire,\nInstalle-toi et demeures-y toujours.\nRemplis-moi de Ton Esprit Saint Seigneur,\nPour que je sois toujours attentif à Ton appel,\nReste auprès de moi, demeure en moi Seigneur,\nAfin que jamais je ne m'éloigne de Toi.\n\nJésus, Jésus, à chaque fois que je te reçois,\nJe voudrais tout recommencer avec Toi.\nQue cette communion soit toujours pour moi\nune grâce renouvelée.\nDonne-moi assez de foi pour sentir ta présence\net en être fortifié.\nTu es le rempart de ma Vie, Seigneur,\nAuprès de Toi je ne redoute plus rien,\nÔ reste avec moi Seigneur, reste avec moi.\nAvec Toi je veux dire maintenant cette prière\nque Tu nous as Toi-même enseignée,\nNotre Père.....\nEt puis je voudrais aussi présenter mes hommages\nà Ta Très Sainte Maman,\nqu'Elle soit toujours mon avocate\nauprès de Ton Coeur miséricordieux:\nJe vous salue, Marie....\n\nMerci pout tant de grâces Jésus.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(99));

		item = new Item();
		item.title = "Jésus, mon guide";
		item.intro = "Hilaire Léonard-Etienne";
		item.content = "Seigneur Jésus, mon guide et mon ami,\ntu m'as ouvert tous les chemins du monde ;\ntu m'as précédé sur toutes les routes\npour que jamais je ne sois sans lumière.\n\nQuand je suis seul,\nje me souviens de toi, priant dans le désert ;\nquand je suis pauvre,\nje revis ta naissance dans la nuit de Noël ;\nquand je suis affligé,\nje te revois près de Lazare.\n\nIl n'y a pas un sentier de la vie\nque tu n'aies emprunté avant moi.\n\nQuand je me sens trahi,\nje me souviens que quelqu'un t'a livré ;\nquand je subis l'injustice,\nje pense à toi devant tes juges ;\nquand l'angoisse m'étreint,\nton agonie est sous mes yeux ;\net quand la mort trouble ma paix,\nje te regarde en croix.\n\nAinsi, Jésus, tu es mon guide,\nmon premier de cordée\nsur la montagne du Tabor.\n\nTu es aussi mon modèle ;\nrien qu'en te regardant, je sais !\nJe sais comment aimer,\nje sais comment souffrir,\ncomment vivre le grand projet de Dieu.\n\nQue ta force à présent\ns'ajoute à ta lumière\npour que je rende visible ton visage\ndans le monde présent.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(100));

		item = new Item();
		item.title = "Montre-moi ton visage";
		item.intro = "Saint Anselme";
		item.content = "Je cherche ton visage, Seigneur,\nne me le cache point.\nEnseigne-moi au plus profond de mon coeur,\noù et comment je dois te chercher,\noù et comment je te trouverai.\nPuisque tu es partout présent,\nd'où vient que je ne te vois pas ?\nTu habites, je le sais, une lumière inaccessible.\nMais où resplendit-elle cette lumière,\net comment parvenir jusqu'à elle ?\nQui me guidera, qui m'introduira\npour que je puisse te voir ?\nRegarde-moi Seigneur et exauce-moi.\nDonne-moi la lumière, montre-toi.\nAie pitié de mes efforts pour te trouver\ncar je ne peux rien sans toi.\nTu nous invites à te regarder, aide-moi;\napprends-moi à te chercher\ncar je ne peux le faire si tu ne me l'apprends pas.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(101));

		item = new Item();
		item.title = "Noël : Jésus, viens ouvrir nos maisons et nos coeurs";
		item.intro = "Élie Maréchal";
		item.content = "Jésus, là où tu es né,\nta crèche n'était pas fermée.\nTu as voulu\nque tout le monde puisse venir Te voir,\nparce que Tu es venu pour tout le monde.\n\nAvant que Tu naisses, Jésus,\nJoseph et Marie n'avaient trouvé\nque des maisons aux portes fermées :\nfermées au secret de Dieu.\nIls ont trouvé ouverte une étable,\nune pauvre étable.\n\nAujourd'hui, Jésus,\nTu ne nais plus dans une étable ;\nmais Tu veux naître, dire le secret de Dieu\ndans toutes les maisons, dans tous les coeurs.\n\nTu veux déposer le baiser de Dieu\nsur tous les visages.\nTu veux des millions de crèches\npour habiter le monde.\nTu veux des millions de coeurs\npour donner ta paix sur la terre.\nTu veux des millions de visages\npour donner la paix de Dieu.\nTu veux des millions de Noëls\npour donner ton Noël.\n\nJésus, viens ouvrir nos maisons et nos coeurs\npour dire avec Toi :\nGloire à Dieu, notre Père !";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(102));

		item = new Item();
		item.title = "Noël : Offrandes";
		item.intro = "";
		item.content = "Enfant de Dieu,\nenfin Te voici\nau bout\nde notre longue recherche !\n\nNous avons traversé\ntant de violences\net nous avons vu\nles bottes souillées de sang.\nNous avons traversé\ntant de haines\net nous avons reçu\nles coups sans pitié.\nNous avons traversé\ntant de pauvretés\net nous avons entendu\nles cris de détresse.\n\nEnfant-Dieu,\nnous avons tant marché, et titubé.\nLe chemin était long, et rude,\net nous avons tout perdu.\n\nNous restent seulement nos mains vides\net le souffle ténu de notre foi\net la flamme tremblante de notre espérance\net la tension brûlante de notre amour.\nRien de resplendissant, Enfant-Dieu\nmais ce sont les uniques trésors\nque nous avons à T'offrir,\net nous le savons,\nEnfant Sauveur,\nTu les poses\ntout contre ton coeur !";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(103));

		item = new Item();
		item.title = "O mon Bien-Aimé";
		item.intro = "Sainte Thérèse de l'Enfant Jésus";
		item.content = "O mon Dieu ! Trinité Bienheureuse, je désire vous Aimer et vous faire Aimer, travailler à la glorification de la Sainte Eglise en sauvant les âmes qui sont sur la terre et en délivrant celles qui souffrent dans le purgatoire. Je désire accomplir parfaitement votre volonté et arriver au degré de gloire que vous m'avez préparé dans votre royaume, en un mot, je désire être Sainte, mais je sens mon impuissance et je vous demande, ô mon Dieu ! d'être vous-même ma Sainteté.\n\nPuisque vous m'avez aimée jusqu'à me donner votre Fils unique pour être mon sauveur et mon Epoux, les trésors infinis de ces mérites sont à moi, je vous les offre avec bonheur, vous suppliant de ne me regarder qu'à travers la Face de Jésus et dans son Coeur brûlant d'Amour.\n\nLe Christ Jésus, mon Epoux Bien-Aimé, aux jours de sa vie mortelle, nous a dit : ''Tout ce que vous demanderez à mon Père, en mon nom, il vous le donnera !'' Je suis donc certaine que vous exaucerez mes désirs ; je le sais. O mon Dieu ! (plus vous voulez donner, plus vous faites désirer). Je sens en mon coeur des désirs immenses et c'est avec confiance que je vous demande de venir prendre possession de mon âme. Ah ! je ne puis recevoir la Sainte communion aussi souvent que je le désire, mais, Seigneur, n'êtes vous pas Tout Puissant ? Restez en moi, comme au tabernacle, ne vous éloignez jamais de votre petite hostie...\n\nAfin de vivre dans un acte de parfait amour, je m'offre comme victime d'holocauste à votre Amour miséricordieux, vous suppliant de me consumer sans cesse, laissant déborder en mon âme les flots de tendresse infinie qui sont renfermés en vous et qu'ainsi je devienne Martyre de votre Amour, ô mon Dieu... !\n\nJe veux, ô mon Bien-Aimé, à chaque battement de mon coeur vous renouveler cette offrande un nombre infini de fois, jusqu'à ce que les ombres s'étant évanouies je puisse vous redire mon Amour dans un Face à Face Eternel !...";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(104));

		item = new Item();
		item.title = "Ouvre-nous à la Vie !";
		item.intro = "Frédéric Fornos";
		item.content = "Père, Toi qui es la source de l'Amour,\nje Te rends grâces, car en Jésus Christ\nTu me révèles le chemin de Vie.\n\nQuand je vois Jésus marcher sur les routes de Galilée,\ndans sa manière d'être avec les gens qu'Il rencontre,\nsa manière d'écouter, de regarder, de toucher,\nd'être ici et maintenant dans la relation aux autres,\nje découvre un chemin d'humanité.\n\nQuand j'écoute ses Paroles tissées par le quotidien,\npar les hommes, la terre et le ciel,\nje découvre un homme qui accueille l'autre\njusqu'à se laisser transformer par lui,\nun homme docile à l'Esprit.\n\nOui, Jésus Christ, mon frère, mon ami,\nTu me révèles que Dieu vient me rejoindre\nau coeur de mon humanité.\nDans ma manière d'écouter, de regarder, de toucher,\nd'être en relation aux autres et au monde,\ndans le retentissement affectif en moi\ndes rencontres, gestes et paroles,\nTu me donnes de discerner l'Esprit qui ouvre à la Vie,\ncar tout ce que je suis,\nimagination, intelligence et affectivité,\ncorps et esprit, est chemin de rencontre avec Toi.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(105));

		item = new Item();
		item.title = "Plénitude de l'être créé et de l'univers";
		item.intro = "Teilhard de Chardin";
		item.content = "Vous êtes, Jésus, le résumé et le faîte\nde toute perfection humaine et cosmique.\nPas un trait de beauté, pas un charme de bonté,\npas un élément de force,\nqui ne trouve en vous son expression épurée\net son couronnement...\nQuand je vous possède, je tiens vraiment\nramassée en un seul objet,\nla réunion idéale de tout ce que l'univers\npeut donner et faire rêver...\nPlénitude de l'être créé, vous êtes aussi, Jésus,\nla plénitude de mon être personnel,\net celle de tous les vivants\nqui acceptent votre domination.\nEn vous et en vous seul,\ncomme dans un abîme sans borne\nnos puissances peuvent se lancer,\ndonner leur pleine mesure,\nsans se heurter à aucune limite...\navec la certitude de ne trouver\ndans vos profondeurs,\nl'écueil d'aucun défaut,\nle fond d'aucune petitesse...\nEn votre sein, mon Dieu,\nmieux que dans aucune étreinte,\nje possède tous ceux que j'aime,\nilluminés par votre beauté,\nnous illuminant à leur tour\ndes rayons qu'ils ont reçus de vous...\nPar vous, je puis toucher à l'intime de chaque être,\nfaire passer en lui ce que je désire,\nsi je sais vous prier...";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(106));

		item = new Item();
		item.title = "Prends ma vie, Seigneur";
		item.intro = "Cardinal Martini";
		item.content = "Jésus,\ntu es le Seigneur de la vie\net de l'Histoire,\nle Seigneur de l'Eglise\net de l'humanité.\nJe te rends grâce\nde m'avoir appelé\nà prendre part, à ma manière,\nau service de ton dessein.\nPour ce dessein, Jésus,\nje te fais volontiers\nl'offrande de moi-même.\nPrends ma vie, Seigneur,\nelle est à toi,\nfais de moi ce que tu veux.\nJe t'aime, Seigneur,\nde tout mon coeur\net de toute ma vie,\nparce que tu m'as aimé\npar ta vie et par ta mort.\nTu es le Seigneur de l'Histoire,\nle Fils de Dieu\nqui ne m'abandonnera jamais;\nc'est toi qui m'as aimé\net qui m'accueilles,\ntu me soutiens et me consoles,\ntu me confortes dans la solitude\net la persécution,\nToi qui me sauves.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(107));

		item = new Item();
		item.title = "Prière après la communion";
		item.intro = "";
		item.content = "Il est donc vrai, Rédempteur des hommes\nque Vous habitez en moi,\nque je suis en possession de votre Corps,\nde votre Sang, de votre âme, de votre Divinité.\n\nJe vous adore ô mon Dieu\ndu plus profond de mon âme\net j'unis mes adorations\nà celles que tous les anges et les saints\nvous rendent dans le ciel.\n\nÔ Dieu d'Amour,\noui je Vous aime de tout mon coeur,\nde toute mon âme, de toutes mes forces.\nJe vous remercie de la grande faveur\nque vous m'avez faîtes de Vous donner à moi.\n\nJe me donne à Vous sans réserve.\nAgréez, divin Jésus cette offrande\nque je vous fais de tout ce que je suis\net de tout ce que je possède.\nDisposez de moi selon votre bon plaisir\net accordez-moi la grâce\nde ne jamais Vous déplaire.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(108));

		item = new Item();
		item.title = "Prière au Christ";
		item.intro = "Saint Ignace de Loyola";
		item.content = "Ame du Christ, sanctifie-moi.\nCorps du Christ, sauve-moi.\nSang du Christ, enivre-moi.\nEau du côté du Christ, lave-moi.\nPassion du Christ, fortifie-moi.\nO bon Jésus, exauce-moi.\nDans tes blessures, cache-moi.\nNe permets pas que je sois séparé de toi.\nDe l'ennemi défends-moi.\nA ma mort, appelle-moi.\nOrdonne-moi de venir à toi.\nPour qu'avec les saints je te loue.\nDans les siècles des siècles.\nAmen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(109));

		item = new Item();
		item.title = "Prière au Christ";
		item.intro = "Wilfred Monod";
		item.content = "O Christ, mon âme a soif de toi.\nElle erre à travers le monde,\nte cherche et s'écrie :\nOn a enlevé mon Seigneur\net je ne sais où on l'a mis!\nJ'aime le firmament étoilé\nparce que tu as levé ton regard\nvers les mêmes constellations.\nJ'aime cette planète\nqui nous emporte à travers l'espace,\nparce qu'elle a porté la trace de tes pas.\nJ'aime le soleil qui nous éclaire,\ncelui-là même qui t'a éclairé.\nJ'aime les psaumes de David\nparce que tu les as médités.\nMais je réclame davantage, ô Christ!\nC'est ton Esprit qu'il me faut et non ton souvenir !\nRévèle-moi donc le grand secret.\nDévoile, au plus modeste de tes disciples,\nle mystère des mystères.\nAccorde-moi la grâce ineffable\nde lire enfin par le coeur la parole\nque tu prononças, selon l'Evangile :\n« Demeurez en moi et je demeurerai en vous. »";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(110));

		item = new Item();
		item.title = "Prière avant la communion";
		item.intro = "";
		item.content = "Divin Jésus,\nquoique je ne Vous voie pas\ndes yeux du corps,\nje crois que c'est Vous-même\nqui allez Vous donner à moi\ndans la Sainte Communion.\nHélas, je suis indigne d'une telle faveur\naprès Vous avoir tant de fois offensé.\n\nÔ Bonté infinie,\nj'ai un extrême regret de tous mes péchés et\nje me propose de ne plus jamais Vous offenser.\nJe Vous aime de tout mon coeur et\nje veux Vous aimer toute ma vie.\n\nVenez donc, mon Seigneur et mon Dieu,\nvenez dans mon coeur que je Vous donne.\nPrenez-en possession, purifiez mon âme,\nremplissez-la de vos grâces et\nétablissez-y Votre Règne pour toujours.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(111));

		item = new Item();
		item.title = "Prière de Réparation au Sacré Coeur";
		item.intro = "Mère Thérésa";
		item.content = "Ô Coeur Sacré de Jésus\nHumblement prosterné devant vous,\nnous venons renouveller notre consécration,\navec la résolution de réparer,\ndans un plus grand amour et une plus grande fidélité envers vous,\ntous les outrages que le monde vous fait subir.\nNous prenons l'engagement :\n\nPlus vos mystères sont blasphémés,\nplus fermement nous croirons en vous,\nÔ Coeur Sacré de Jésus !\nPlus l'impiété s'efforce d'étouffer notre espérance d'éternité,\nplus nous mettrons notre confiance dans votre Coeur,\nunique espoir des mortels !\n\nPlus nombreux sont les coeurs qui résistent à votre amour divin,\nplus nous vous aimerons,\nÔ Coeur de Jésus infiniment aimable !\n\nPlus votre divinité est attaquée, plus nous l'adorerons,\nÔ Coeur Divin de Jésus !\n\nPlus vos lois divines sont oubliées et transgressées,\nplus nous les observerons,\nÔ Coeur très Saint de Jésus !\n\nPlus vos sacrements sont méprisés et abandonnés,\nplus nous les fréquenterons avec amour et respect,\nÔ Coeur miséricordieux de Jésus !\n\nPlus vos adorables vertus sont oubliées,\nplus nous nous efforcerons de les mettre en pratique,\nÔ Coeur modèle de toute vertu !\n\nPlus l'orgueil et la sensualité\ntendent à détruire l'esprit d'abnégation et l'amour du devoir,\nplus nous nous efforcerons de nous dominer, Ô Coeur de Jésus !\n\nPlus la loi sainte du mariage est négligée et violée,\nplus nous la suivrons avec amour et fidélité,\nÔ Coeur Sacré de Jésus !\n\nPlus le démon s'acharne à détruire\nla vie de prière et la pureté des âmes consacrées,\nplus nous essaierons de garder pure la pureté,\nchaste la chasteté, vierge la virginité.\nÔ Coeur Sacré de Jésus !\n\nPlus les mères détruisent\nla présence et l'image de Dieu par l'avortement,\nplus nous sauverons de ces enfants encore à naître\nen les faisant adopter.\nÔ Coeur Sacré de Jésus !\n\nÔ Coeur Sacré,\ndonnez-nous une grâce qui soit si forte et si puissante,\nqu'elle nous permette de devenir vos apôtres au coeur du monde,\net votre couronne dans l'éternité.\n\nAmen !";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(112));

		item = new Item();
		item.title = "Prière de Saint Ambroise de Milan";
		item.intro = "Saint Ambroise de Milan";
		item.content = "Si tu brûles de fièvre, Il est la Source qui rafraîchit ;\nSi tu es oppressé par tes fautes, Il est la Délivrance ;\nSi tu as besoin d'aide, Il est la Force ;\nSi tu as peur de la mort, Il est la Vie ;\nSi tu désires le ciel , Il est la Voie ;\nSi tu fuis les ténèbres, Il est la Lumière ;\nSi tu as besoin de nourriture, Il est l'Aliment.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(113));

		item = new Item();
		item.title = "Prière à Jésus, l'Emmanuel";
		item.intro = "";
		item.content = "Viens, Jésus ; viens, Toi qui es vivant !\nO Emmanuel, pardonne-moi,\nprends ma faiblesse dans Ta Force,\nprends ma sécheresse dans Ta Fontaine,\nprends mon âme dans Tes Mains ;\n\nPerpétuelle Source d'Amour,\nconsume chaque fibre de mon coeur\npour aimer, pour louer\net pour déclarer sublime Ton Nom ;\n\nRends mon esprit assoiffé de mon Créateur,\nafin que cette poussière\ndont Tu as façonné Ton enfant\ndevienne une ardente flamme d'amour,\ncar Tu as pouvoir de vie et de mort ;\n\nTon Regard a le pouvoir de fondre le fer ;\nTon Amour Jaloux, de faire que ma vie\nsoit considérée comme folie par les sages ;\naussi, pointe à nouveau Ta flèche\net tire sur Ta cible favorite";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(114));

		item = new Item();
		item.title = "Prière à Jésus, le véritable Ami";
		item.intro = "Saint Claude La Colombière";
		item.content = "Jésus, tu es le seul et véritable Ami.\nTu m'écoutes toujours avec bonté.\nTu as le secret d'adoucir mes peines\net de renouveler sans cesse mon espérance.\nToi seul connais le fond de mon coeur.\nComme l'Ami fidèle, Tu es mon puissant soutien :\n''celui qui Te trouve a trouvé son Trésor''.\nToujours et partout Tu es avec moi :\ndans ton immense tendresse\nTu viens en mon coeur faire ta demeure.\nRévèle la merveille de ton Amitié Divine\naux mals-aimés, aux désespérés,\nà tous les accablés de souffrances.\n\nJésus, je suis si persuadé que Tu veilles\nsur ceux qui espèrent en Toi et\nqu'on ne peut manquer de rien\nquand on attend de Toi toutes choses,\nque j'ai résolu de vivre à l'avenir sans aucun souci\net de me décharger sur Toi de toutes mes inquiétudes,\npuisque Tu n'abandonnes jamais ceux\nqui ont confiance en l'Amour de ton Coeur.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(115));

		item = new Item();
		item.title = "Prière à la Sainte Face";
		item.intro = "Sainte Thérèse de l'Enfant Jésus";
		item.content = "Ô Jésus, qui dans votre cruelle Passion êtes devenu\n''l'opprobre des hommes et l'homme de douleurs'',\nje vénère votre divin visage,\nsur lequel brillaient la beauté et la douceur de la divinité,\nmaintenant devenu pour moi\ncomme le visage d'un ''lépreux'' !\n\nMais sous ses traits défigurés,\nje reconnais votre amour infini\net je me consume du désir de vous aimer\net de vous faire aimer de tous les hommes.\nLes larmes qui coulèrent si abondamment de vos yeux\nm'apparaissent comme des perles précieuses\nque j'aime à recueillir,\nafin d'acheter avec leur valeur infinie\nles âmes des pauvres pêcheurs.\n\nÔ Jésus, dont le visage est la seule beauté\nqui ravit mon coeur,\nj'accepte de ne pas voir ici-bas,\nla douceur de votre regard,\nde ne pas sentir l'inexprimable baiser\nde votre bouche sainte;\nmais je vous supplie d'imprimer en moi\nvotre divine resemblance,\nde m'embraser de votre amour,\nafin qu'il me consume rapidement\net que j'arrive bientôt à voir\nvotre glorieux visage dans le Ciel.\nAmen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(116));

		item = new Item();
		item.title = "Prière à l'Enfant Jésus";
		item.intro = "";
		item.content = "O Saint Enfant-Jésus\nqui répands tes grâces sur ceux qui t'invoquent,\nregarde-nous prosternés devant ta sainte image\net écoute notre prière.\n\nNous te recommandons tous les nécessiteux\nqui se confient à ton Divin Coeur.\n\nEtends sur eux ta main toute-puissante\net viens au secours de leur indigence.\n\nEtends la main sur les malades\npour les guérir et sanctifier leurs peines ;\nsur les affligés pour les consoler ;\nsur les pécheurs pour les attirer\nà la lumière de ta grâce ;\nsur ceux qui, accablés par la douleur et la misère,\ninvoquent avec confiance ton aide pleine d'amour.\n\nEtends la main encore sur nous pour nous bénir.\n\nAccorde ô Petit Roi,\nles trésors de ta miséricorde au monde entier\net garde-nous maintenant et toujours\ndans la grâce de ton amour !\nAmen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(117));

		item = new Item();
		item.title = "Prière à l'hôte silencieux du Tabernacle";
		item.intro = "Marthe Robin";
		item.content = "Prends-moi dans ton silence,\nloin des bruits et de l'agitation du monde.\nDans un silence\noù tout mon être se retrouve en sa vérité,\nen sa nudité, en sa misère,\ncar ce silence\nme permet de me découvrir moi-même.\n\nPrends-moi dans la richesse divine\nde ton silence,\ncapable de tout combler en mon âme.\nFais taire en moi ce qui n'est pas de toi,\nce qui n'est pas ta Présence toute pure,\ntoute paisible.\nImpose silence à mes désirs,\nà mes caprices, à mes rêves d'évasion,\nà la violence de mes passions.\nCouvre par ton silence\nma nature trop impatiente à te parler,\ntrop encline à l'action extérieure et bruyante.\nImpose même ton silence à ma prière.\nRends-la gratuite et vraiment confiante\nen ta seule grâce.\nFais descendre ton silence\njusqu'au fond de mon être,\net fais remonter ce silence\nen pur élan vers toi,\nen hommage d'amour.\n\nAmen !";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(118));

		item = new Item();
		item.title = "Que Ton Esprit souffle en nos coeurs";
		item.intro = "";
		item.content = "Seigneur Jésus-Christ,\ntu as osé te tenir debout\nlà où combien se soumettent en rampant.\nTu es demeuré fidèle au Père.\nDans chacun de tes gestes,\ntu as vécu l'amour jusqu'au bout,\nquel qu'en soit le prix.\n\nFils aimant du Père, sois-en béni.\nQue ton Esprit souffle en nos coeurs\ndans l'épreuve de nos déserts.\nA l'heure cruciale des choix qui comptent,\nque l'Esprit insuffle à tes disciples\nle courage et la liberté,\nla joie de l'intégrité,\nle désir d'aimer.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(119));

		item = new Item();
		item.title = "Rayonne à travers moi";
		item.intro = "Cardinal Newman";
		item.content = "Seigneur Jésus,\ninonde-moi de ton Esprit et de ta vie.\nPrends possession de tout mon être\npour que ma vie ne soit\nqu'un reflet de la tienne\n\nRayonne à travers moi, habite en moi,\net tous ceux que je rencontrerai\npourront sentir ta Présence auprès de moi,\nen me regardant ils ne verront plus que Toi seul,\nSeigneur!\n\nDemeure en moi et alors je pourrai,\ncomme Toi, rayonner,\nau point d'être à mon tour\nune lumière pour les autres,\nlumière, Seigneur,\nqui émanera complètement de Toi,\nc'est Toi qui, à travers moi,\nilluminera les autres.\n\nAinsi ma vie deviendra une louange à ta gloire,\nla louange que tu préfères,\nen te faisant rayonner sur ceux qui nous entourent.\nPar la plénitude éclatante de l'amour\nque te porte mon coeur.\n\nAmen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(120));

		item = new Item();
		item.title = "Seigneur, je te demande la Grâce de la rencontre";
		item.intro = "Père Sébastien O. Praem";
		item.content = "Te rencontrer, Seigneur,\nce n'est pas le résultat d'un raisonnement,\nc'est l'éclair de Ta présence en moi,\nPrésence immédiate,\nPrésence silencieuse,\nPrésence bouleversante,\ncar elle enveloppe tout mon être.\n\nQuand je me fais très silencieux,\nje sens que je vis, je sens mon ''être'' en moi,\net à travers cette conscience de mon être,\nje Te rencontre, Toi, mon Seigneur et mon Dieu.\n\nSeigneur, je voudrais Te demander\nla grâce de savoir prier.\nDe Te prier longuement, intensément.\nEt c'est pourquoi, je me tiens ici devant Toi,\npour que Ton regard repose sur moi.\nJe suis simplement là\npour que Ton Esprit prie en moi.\nJe veux me tenir en silence devant Toi\net arriver à ne rien dire\nmais simplement à être devant Toi\nsous Ton regard.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(121));

		item = new Item();
		item.title = "Seigneur, tu es là";
		item.intro = "Jacques Brouillard";
		item.content = "Seigneur, Tu es là,\nmême lorsque mon coeur est brisé,\ntu me fais sourire;\npar ton Esprit, je reçois Ta consolation\n\nSeigneur, Tu es là,\nmême lorsque mon âme est abattue\ndevant l'adversité qui se dresse devant moi,\npar ton Esprit, je reçois Ta direction.\n\nSeigneur, Tu es là,\nmême quand je me suis laissé entraîner\nsur une mauvaise voie,\npar ton Esprit Tu me redonnes une chance\net Tu me pardonnes...encore une fois.\n\nSeigneur, Tu es là,\nlorsque environné par les ennemis de mon âme,\nton Esprit m'installe en sécurité,\nsur le roc de Ta Parole.\n\nQuand j'ai besoin d'amour, Tu es là, Jésus,\nquand j'ai besoin d'être relevé, Tu es là, Jésus\nquand j'ai besoin d'être purifié, Tu es là, Jésus,\nquand j'ai besoin d'affection, de bienveillance, Tu es là, Jésus,\nquand j'ai besoin d'amitié, de communion, Tu es là, Jésus.\n\nMerci de me le rappeler, merci de ne pas m'oublier, Jésus !";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(122));

		item = new Item();
		item.title = "Sois ma lumière";
		item.intro = "Cardinal Newman";
		item.content = "Seigneur Jésus,\ninonde-moi de Ton Esprit et de Ta Vie.\nPrends possession de tout mon être\npour que ma vie ne soit\nqu'un reflet de la Tienne.\n\nRayonne à travers moi, habite en moi,\net tous ceux que je rencontrerai\npourront sentir Ta présence auprès de moi.\nEn me regardant, ils ne verront plus\nque Toi seul, Seigneur !\n\nDemeure en moi et alors je pourrai,\ncomme Toi, rayonner,\nau point d'être à mon tour\nune lumière pour les autres.\n\nAinsi ma vie deviendra\nune louange à Ta gloire,\nla louange que Tu préfères,\nen Te faisant rayonner\nsur ceux qui nous entourent.\n\nPar la plénitude éclatante de l'amour\nque Te porte mon coeur.\n\nAmen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(123));

		item = new Item();
		item.title = "Ta croix";
		item.intro = "Louis Aragon";
		item.content = "Sur les chemins où nous peinons,\ncomme il est bon, Seigneur,\nde rencontrer ta croix !\n\nSur les sommets que nous cherchons,\nnous le savons, Seigneur,\nnous trouverons ta croix !\n\nEt lorsqu'enfin nous te verrons,\ndans ta clarté, Seigneur,\nnous comprendrons ta croix.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(124));

		item = new Item();
		item.title = "Ta main, Jésus";
		item.intro = "";
		item.content = "Ta main m'invite : Viens !\nTa main me fait comprendre : N'aie pas peur !\nTa main m'offre la certitude : Je t'aime !\nDans ta main je trouve un refuge et ainsi,\nJe suis à l'abri pour toujours.\nEt si, malgré cela, je devais tomber dans un abîme,\nJe sais : Au fond de cet abîme\nTa main est là pour m'acceuillir,\nTa main, de bonté qui abrite tout.\nEt personne ne peut m'arracher\nDe ta main aimante.\nJésus : Que ta main me saisisse moi aussi,\nCar dans ta main, tout s'arrange pour mon bien.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(125));

		item = new Item();
		item.title = "Toi, le Ressuscité";
		item.intro = "Frère Roger de Taizé";
		item.content = "Toi le Ressuscité\ncomme un pauvre\nqui ne veut pas s'imposer,\nTu accompagnes chacun\nsans forcer l'entrée de notre coeur.\nTu es là, Tu offres ta confiance,\nTu ne délaisses personne,\nmême quand les profondeurs\ncrient de solitude.\nPour t'accueillir\nnous avons besoin de guérison.\nPour Te reconnaître, il importe\nque nous prenions le risque de refaire\nà tout moment le choix de Te suivre.\n\nSans ce choix,\nà chaque fois radical, nous nous traînons.\n\nTe choisir,c'est t'entendre nous dire :\n''Toi, m'aimes-tu plus que tout autre ?''";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(126));

		item = new Item();
		item.title = "Toi qui m'aimes comme je suis";
		item.intro = "Michel_Hubault";
		item.content = "Seigneur, réconcilie-moi avec moi-même.\nComment pourrais-je rencontrer et aimer les autres\nSi je ne me rencontre et ne m'aime plus.\n\nSeigneur, Toi qui m'aimes tel que je suis\nEt non tel que je me rêve,\nAide-moi à accepter ma condition d'homme\nLimité mais appelé à se dépasser.\n\nApprends-moi à vivre\navec mes ombres et mes lumières,\nmes douceurs et mes colères,\nmes rires et mes larmes,\nmon passé et mon présent.\n\nDonne-moi de m'accueillir comme Tu m'accueilles,\nde m'aimer comme Tu m'aimes.\nDélivre-moi de la perfection que Tu veux me donner,\nouvre-moi à la sainteté que Tu veux m'accorder.\n\nEpargne-moi le remords de Judas\nrentrant en lui-même pour n'en plus sortir,\népouvanté et désespéré par son péché.\n\nAccorde-moi le repentir de Pierre,\nrencontrant le silence de ton regard\nplein de tendresse et de pitié.\n\nEt si je dois pleurer,\nque ce ne soit pas sur moi-même\nmais sur ton Amour offensé.\n\nSeigneur, Tu connais le désespoir qui ronge mon coeur.\nLe dégoût de moi-même,\nje le projette sans cesse sur les autres !\nQue ta tendresse me fasse exister à mes propres yeux !\nJe voudrais tellement déverrouiller la porte de ma prison\ndont je serre moi-même la clef !\n\nDonne-moi le courage de sortir de moi-même.\nDis-moi que tout est possible à celui qui croit.\nDis-moi si je peux encore guérir\ndans la lumière de ton regard et de ta Parole.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(127));

		item = new Item();
		item.title = "Toi qui nous as aimés le premier";
		item.intro = "Søren Kierkegaard";
		item.content = "Toi qui nous as aimés le premier, ô Dieu,\nhélas ! nous en parlons\ncomme si Tu nous avais aimés le premier\nqu'une seule fois, à la manière historique,\nalors que sans cesse,\nbien des fois le long des jours et de la vie entière,\nTu nous aimes le premier.\nQuand nous nous éveillons le matin\net que nous tournons notre âme vers Toi,\nTu es le premier, Tu nous as aimés le premier:\nsi je me lève à l'aube\net tourne à la même seconde vers Toi\nmon âme et ma prière,\nTu me devances,\nTu m'as aimé le premier.\nQuand je me retire de la distraction\net recueille mon âme pour penser à Toi,\nTu es le premier.\nEt ainsi toujours,\net nous parlons en ingrats,\ncomme si Tu ne nous aimais ainsi\nle premier qu'une seule fois.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(128));

		item = new Item();
		item.title = "Tu es le centre éblouissant";
		item.intro = "Teilhard de Chardin";
		item.content = "Christ glorieux,\nTu es le Centre éblouissant\noù se relient\nles fibres sans nombre du multiple.\nTes mains emprisonnent les étoiles.\nTu es le premier et le dernier,\nle vivant, le mort et le ressuscité.\nTu rassembles en ton unité\ntoutes les forces, tous les états,\nc'est Toi que j''appelle\nd'un désir aussi vaste que l'univers :\nTu es vraiment mon Seigneur et mon Dieu !\n\nJésus, écoute le désir de tout mon être,\net jusqu'au plus intime de ton Coeur\nattire-moi !\nIl faut que,\nmême emprisonné dans ton intimité,\nje me sente cependant errer librement\nà travers le ciel de toutes tes créatures.\nFais que je contemple\nle lieu où converge le coeur du monde\ndans le rayonnement du coeur de Dieu.\nApprends-moi la pureté vraie,\ncelle qui est élan à travers toutes les beautés.\nRévèle-moi la charité véritable,\ncelle qui est la volonté vigoureuse\nde forcer, tous ensemble, les portes de la vie.\nDonne-moi surtout\nune vision grandissante de ton omniprésence\nafin de pénétrer toujours davantage\nen Toi.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(129));

		item = new Item();
		item.title = "Tu vois qui je suis";
		item.intro = "Frère Roger de Taizé";
		item.content = "Dieu qui nous aime par l'Evangile\nnous comprenons que personne n'est exclu de ton Amour\net que ton Esprit-Saint ne nous laisse jamais seuls :\nIl nous donne d'être en communion avec Toi.\n\nAlors, humblement, nous Te disons :\nToi, le Christ, Tu vois qui je suis,\nj'ai besoin de ne rien Te cacher de mon coeur\nTu m'accueilles avec mes peines et mes inquiétudes\nTu comprends tout de moi.\n\nJésus, fils de Marie, à chacun Tu offres\nle message de joie et d'espérance de Noël.\nSi démunis soyons-nous, donne-nous de mettre la Paix\nlà où il y a des oppositions et de rendre perceptible\npar notre vie un reflet de la compassion de Dieu\n\nOui, donne-nous d'aimer et de le dire par notre vie.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(130));

		item = new Item();
		item.title = "Unis-nous, Seigneur Jésus";
		item.intro = "";
		item.content = "O Dieu, Père de notre Seigneur Jésus-Christ.\nnotre unique Sauveur, Prince de la paix,\nfais-nous la grâce de prendre à coeur\nle scandale de nos divisions.\n\nDélivre-nous de toute haine, de tout préjugé\net de tout ce qui entrave notre union,\nafin que,comme il y a un seul corps et un seul Esprit,\nune seule espérance en notre vocation,\nun seul Dieu et Père de tous,\nde même nous ne soyons qu'un coeur et qu'une âme,\nunis par les liens de la grâce et de la vérité,\nde la foi et de l'amour,\nen Jésus-Christ, notre Seigneur.\n\nPar-dessus les frontières de langue, de race, de nations,\nunis-nous, Seigneur Jésus.\nPar-dessus nos ignorances, nos préjugés,\nnos inimitiés instinctives,\nunis-nous, Seigneur Jésus.\nPar-dessus nos barrières intellectuelles et spirituelles,\nunis-nous, Seigneur Jésus.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(131));

		item = new Item();
		item.title = "Vivre l'aujourd'hui de Dieu";
		item.intro = "Frère Roger de Taizé";
		item.content = "Jésus le Christ, tu le sais,\njamais nous ne voudrions choisir l'obscurité,\nmais toujours accueillir ta lumière intérieure.\n\nJésus le Ressuscité,\nsi peu que nous percevions ton Esprit-Saint,\nil est vie pour nous.\nSi peu que nous comprenions ton Evangile,\nil est lumière au milieu de nous.\nSi peu que nous saisissions ton Eucharistie,\nelle est présence vivante en nous.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(132));

		category.addSubCategory(new Integer(17));
		categories.addElement(subCategory);

		category = new Category();
		category.title = "Italiano";
		category.parentId = 0;

		categories.addElement(category);
		topCategory.addSubCategory(new Integer(18));

		subCategory = new Category();
		subCategory.title = "Elementare";
		subCategory.parentId = 18;

		item = new Item();
		item.title = "Segno della croce";
		item.intro = "";
		item.content = "Nel nome del Padre e del Figliolo e dello Spinto Santo. Cosi sia.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(133));

		item = new Item();
		item.title = "Pater noster";
		item.intro = "";
		item.content = "Padre nostro, che sei nei cieli, sia santificato il tuo nome, venga il tuo regno, sia fatta la tua volontà, come in cielo così in terra. Dacci oggi il nostro pane quotidiano, e rimetti a noi i nostri debiti come noi li rimettiamo ai nostri debitori, e non ci indurre in tentazione, ma liberaci dal male. Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(134));

		item = new Item();
		item.title = "Ave Maria";
		item.intro = "";
		item.content = "Ave o Maria, piena di grazia; il Signore e con te; tu sei benedetta fra le donne, e benedetto è il frutto del ventre tuo, Gesù. Santa Maria, Madre di Dio, prega per noi peccatori, adesso e nell'ora della nostra morte. Cosi sia.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(135));

		item = new Item();
		item.title = "Gloria Patri";
		item.intro = "";
		item.content = "Gloria al Padre e al Figliolo e allo Spirito Santo, come era nel principio, e ora, e sempre, nei secoli dei secoli. Cosi sia.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(136));

		item = new Item();
		item.title = "Angele Dei";
		item.intro = "";
		item.content = "Angelo di Dio, che sei il mio custode, illumina, custodisci, reggi e governa me, che ti fui affidato dalla pietà celeste. Cosi sia";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(137));

		item = new Item();
		item.title = "Credo (Simbolo degli Apostoli)";
		item.intro = "";
		item.content = "Io credo in Dio Padre onnipotente, Creatore del cielo e della terra; e in Gesù Cristo, suo unico Figliolo, nostro Signore, il quale fu concepito di Spinto Santo, nacque da Maria Vergine, patì sotto Ponzio Pilato, fu crocifisso, morì e fu sepolto; discese all'inferno; il terzo giorno risuscitò da morte; salì al cielo, siede alla destra di Dio Padre onnipotente, di la ha da venire a giudicare i vivi e i morti. Credo nello Spirito Santo, la santa Chiesa cattolica, la comunione dei santi, la remissione dei peccati, la risurrezione della carne, la vita eterna.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(138));

		item = new Item();
		item.title = "Credo (Simbolo Niceno-Costantinopolitano)";
		item.intro = "";
		item.content = "Credo in un solo Dio, Padre onnipotente, creatore del cielo e della terra, di tutte le cose visibili e invisibili. Credo in un solo Signore, Gesù Cristo, unigenito Figlio di Dio, nato dal Padre prima di tutti i secoli: Dio da Dio, Luce da Luce, Dio vero da Dio vero, generato, non creato, della stessa sostanza del Padre; per mezzo di lui tutte le cose sono state create. Per noi uomini e per la nostra salvezza discese dal cielo, e per opera dello Spirito Santo si è incarnato nel seno della Vergine Maria e si è fatto uomo. Fu crocifisso per noi sotto Ponzio Pilato, morì e fu sepolto. Il terzo giorno è risuscitato, secondo le Scritture, è salito al cielo, siede alla destra del Padre. E di nuovo verrà, nella gloria, per giudicare i vivi e i morti, e il suo regno non avrà fine. Credo nello Spirito Santo, che è Signore e da la vita, e procede dal Padre e dal Figlio. Con il Padre e il Figlio è adorato e glorificato, e ha parlato per mezzo dei profeti. Credo la Chiesa una santa cattolica e apostolica e la vita del mondo che verrà. Amen";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(139));

		item = new Item();
		item.title = "Salve Regina";
		item.intro = "";
		item.content = "Salve, o Regina, madre di misericordia; vita, dolcezza e speranza nostra, salve. A te ricorriamo, noi esuli figli di Eva; a te sospiriamo gementi e piangenti in questa valle di lacrime. Orsù dunque, avvocata nostra, rivolgi a noi quegli occhi tuoi misericordiosi. E mostraci dopo questo esilio Gesù, il frutto benedetto del ventre tuo. O clemente, o pia, o dolce Vergine Maria.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(140));

		item = new Item();
		item.title = "Angelus";
		item.intro = "";
		item.content = "V. L'Angelo del Signore portò l'annunzio a Maria.\nR. Ed ella concepì per opera dello Spinto Santo.\nAve, o Maria...\nV, Ecco l'ancella del Signore.\nR. Sia fatto di me secondo la tua parola.\nAve, o Maria...\nV. E il Verbo si è fatto carne.\nR. Ed ha abitato fra noi.\nAve, o Maria...\nV. Prega per noi, santa Madre di Dio.\nR. Affinché siamo resi degni delle promesse di Cristo.\nPreghiamo\nDegnati, Signore, infondere la tua grazia nelle anime nostre, affinché, come per l'annunzio dell'Angelo abbiamo conosciuto l'incarnazione di Cristo, tuo Figlio, così per la sua passione e croce, giungiamo alla gloria della risurrezione. Per Cristo nostro Signore.\nR. Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(141));

		item = new Item();
		item.title = "Regina Coeli";
		item.intro = "";
		item.content = "V. Regina del cielo, rallegrati, alleluia;\nR. Perché colui che ti fu dato di portare nel seno, alleluia.\nV. E’ risorto, come disse, alleluia.\nR. Prega Dio per noi, alleluia.\nV. Godi e rallegrati, Vergine Maria, alleluia.\nR. Perché il Signore e veramente risorto alleluia.\nPreghiamo\nO Dio, che ti sei degnato di rallegrare il mondo con la risurrezione del Figlio tuo nostro Signore Gesù Cristo, concedi, te ne preghiamo, che per i menti della Madre Sua, la Vergine Maria, possiamo giungere alle gioie della vita eterna. Per Cristo nostro Signore.\nR. Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(142));

		item = new Item();
		item.title = "Veni Sancte Spiritus";
		item.intro = "";
		item.content = "Vieni Santo Spirito, riempi il cuore dei tuoi fedeli e accendi in essi il fuoco del tuo amore.\nV. Manda il tuo spirito per una nuova creazione.\nR. E rinnoverai la faccia della terra.\nPreghiamo\nO Signore, che hai istruito i cuori dei fedeli con la luce dello Spirito Santo, donaci di gustare nello stesso Spirito la verità e di godere sempre della sua consolazione. Per Cristo nostro Signore.\nR. Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(143));

		item = new Item();
		item.title = "Preghiera di S. Michele Arcangelo";
		item.intro = "";
		item.content = "San Michele Arcangelo, difendici nella battaglia; sii tu nostro sostegno contro la perfidia e le insidie del diavolo, che Dio eserciti il suo dominio su di lui,  te ne preghiamo supplichevoli; e tu o Principe della milizia celeste, con la potenza divina, ricaccia nell'inferno satana e gli altri spiriti maligni i quali errano nel mondo per perdere le anime. Amen";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(144));

		item = new Item();
		item.title = "Preghiera all'Angelo Custode";
		item.intro = "";
		item.content = "Assistimi, santo Angelo custode, soccorso nelle mie necessità, conforto nelle mie sventure, protettore nei pericoli, ispiratore di buoni pensieri, intercessore presso Dio, scudo che respingi il maligno nemico, compagno fedele, amico sicurissimo, prudente consigliere, modello di obbedienza, specchio di umiltà e di purezza. Assisteteci, Angeli che ci custodite, Angeli delle nostre famiglie, Angeli dei nostri bambini, Angeli delle nostre Parrocchie, Angelo della nostra città, Angelo del nostro paese, Angeli della Chiesa, Angeli dell'universo.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(145));

		category.addSubCategory(new Integer(19));
		categories.addElement(subCategory);

		subCategory = new Category();
		subCategory.title = "Devoto";
		subCategory.parentId = 18;

		item = new Item();
		item.title = "Atto di Fede";
		item.intro = "";
		item.content = "Mio Dio, perché siete verità infallibile, credo fermamente tutto quello che voi avete rivelato e la Santa Chiesa ci propone a credere. Ed espressamente credo in voi, unico vero Dio in tre Persone uguali e distinte, Padre, Figliolo e Spirito Santo. E credo in Gesù Cristo, Figlio di Dio, incarnato e morto per noi, il quale darà a ciascuno, secondo i meriti, il premio o la pena eterna. Conforme a questa Fede voglio sempre vivere. Signore, accrescete la mia fede.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(146));

		item = new Item();
		item.title = "Atto di Speranza";
		item.intro = "";
		item.content = "Mio Dio, spero dalla bontà vostra, per le vostre promesse e per i meriti di Gesù Cristo, nostro Salvatore, la vita eterna e le grazie necessarie per meritarla con le buone opere, che io debbo e voglio fare. Signore, che io non resti confuso in eterno.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(147));

		item = new Item();
		item.title = "Atto di Carità";
		item.intro = "";
		item.content = "Mio Dio, vi amo con tutto il cuore sopra ogni cosa, perché siete Bene infinito e nostra eterna felicità; e per amor vostro amo il prossimo mio come me stesso, e perdono le offese ricevute. Signore, fate ch'io vi ami sempre più.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(148));

		item = new Item();
		item.title = "Atto di Dolore";
		item.intro = "";
		item.content = "Mio Dio, mi pento e mi dolgo con tutto il cuore dei miei peccati, perché peccando ho meritato i vostri castighi, e molto più perché ho offeso voi infinitamente buono e degno di essere amato sopra ogni cosa. Propongo col vostro santo aiuto di non offendervi mai più e di fuggire le occasioni prossime del peccato. Signore, misericordia, perdonatemi.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(149));

		item = new Item();
		item.title = "Preghiera della mattina";
		item.intro = "";
		item.content = "Ti adoro, mio Dio, e ti amo con tutto il cuore. Ti ringrazio di avermi creato, fatto cristiano e Conservato in questa notte. Ti offro le azioni della giornata, fa' che siano tutte secondo la tua santa volontà e per la maggior Tua gloria. Preservami dal peccato e da ogni male. La tua grazia sia sempre con me e con tutti i miei cari. Così sia.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(150));

		item = new Item();
		item.title = "Preghiera della sera";
		item.intro = "";
		item.content = "Ti adoro, mio Dio, e Ti amo con tutto il cuore. Ti ringrazio di avermi creato/a, fatto/a cristiano e conservato in questo giorno. Ti ringrazio di avermi creato e se qualche bene ho compiuto, accettalo.. Custodiscimi nel riposo e liberami dai pericoli. La tua grazia sia sempre con me e con tutti i miei cari. Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(151));

		item = new Item();
		item.title = "Offerta di Se Stesso";
		item.intro = "";
		item.content = "Prendete, Signore, e ricevete tutta la mia libertà, la mia memoria, il mio intelletto e tutta la mia volontà, ogni mio avere e ogni mio possesso, voi me lo deste, a voi, Signore, lo rendo; tutto è vostro, disponete secondo la vostra volontà, datemi il vostro amore e la vostra grazia, che questa mi basta. Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(152));

		item = new Item();
		item.title = "Preghiera per il lavoro";
		item.intro = "";
		item.content = "Gesù, che, pur essendo il padrone dell'Universo, hai voluto assoggettarti lla legge del lavoro, guadagnandoti il pane col sudore della tua fronte, noi ti riconosciamo e ti proclamiamo nostro modello e Redentore del lavoro. Benedici, o divino operaio di Nazareth, la nostra quotidiana fatica, che ti offriamo come sacrificio di espiazione e di propiziazione. Benedici il sudore della nostra fronte, affinché ci procuri un pane sufficiente per noi e per le nostre famiglie. E concedi che sul mondo del lavoro, travagliato da tante incertezze e difficoltà, risplenda sempre la Tua provvida benedizione, e fa che tutti possano ottenere e conservare un onesto e dignitoso lavoro. Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(153));

		item = new Item();
		item.title = "Offerta della gironata al cuore di Gesu";
		item.intro = "";
		item.content = "Cuore divino di Gesù, io ti offro, per mezzo del cuore immacolato di Maria, Madre della Chiesa in unione al Sacrificio Eucaristico, le preghiere e le azione, le gioie e le sofferenze di questo giorno, in riparazione dei peccati, e per la salvezza di tutti gli uomini, nella grazie dello Spirito Santo. A gloria del divin Padre. Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(154));

		category.addSubCategory(new Integer(20));
		categories.addElement(subCategory);

		subCategory = new Category();
		subCategory.title = "Catechismo";
		subCategory.parentId = 18;

		item = new Item();
		item.title = "I due Misteri Principali della Fede";
		item.intro = "";
		item.content = "1. Unità e Trinità di Dio.\n2. Incarnazione, Passione, Morte e Resurrezione di nostro Signore Gesù Cristo.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(155));

		item = new Item();
		item.title = "I due Comandamenti della Carità";
		item.intro = "";
		item.content = "1. Amerai il Signore tuo Dio con tutto il tuo cuore, con tutta la tua anima e con tutta la tua mente.\n2. Amerai il prossimo tuo come te stesso.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(156));

		item = new Item();
		item.title = "I dieci comandamenti di Dio o Decalogo";
		item.intro = "";
		item.content = "Io sono il Signore Dio tuo\n1. Non avrai altro Dio fuori che me.\n2. Non nominare il nome di Dio invano.\n3. Ricordati di santificare le feste.\n4. Onora il padre e la madre.\n5. Non ammazzare.\n6. Non fornicare.\n7. Non rubare.\n8. Non dire falsa testimonianza.\n9. Non desiderare la donna d'altri.\n10. Non desiderare la roba d'altri.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(157));

		item = new Item();
		item.title = "I cinque precetti generali della Chiesa";
		item.intro = "";
		item.content = "1. Udire la Messa la domenica e le altre feste comandate.\n2. Santificare i giorni di penitenza secondo le disposizioni della Chiesa.\n3. Confessarsi almeno una volta all'anno, e comunicarsi almeno a Pasqua.\n4 . Soccorrere alle necessità della Chiesa, contribuendo secondo le leggi o le usanze.\n5 . Non celebrare solennemente le nozze nei tempi proibiti.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(158));

		item = new Item();
		item.title = "I sette Sacramenti";
		item.intro = "";
		item.content = "1. Battesimo\n2. Cresima\n3. Eucarestia\n4. Confessione\n5. Estrema Unzione\n6. Ordine\n7. Matrimonio";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(159));

		item = new Item();
		item.title = "I sette Doni dello Spirito Santo";
		item.intro = "";
		item.content = "1. Sapienza\n2. Intelletto\n3. Consiglio\n4. Fortezza\n5. Scienza\n6. Pietà\n7. Timor di Dio";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(160));

		item = new Item();
		item.title = "Le tre Virtù Teologali";
		item.intro = "";
		item.content = "1. Fede\n2. Speranza\n3. Carità";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(161));

		item = new Item();
		item.title = "Le quattro Virtù Cardinali";
		item.intro = "";
		item.content = "1. Prudenza\n2. Giustizia\n3. Fortezza\n4. Temperanza";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(162));

		item = new Item();
		item.title = "Le sette opere di misericordia corporale";
		item.intro = "";
		item.content = "1. Dar da mangiare agli affamati\n2. Dar da bere agli assetati\n3. Vestire gl'ignudi\n4. Alloggiare i pellegrini\n5. Visitare gl'infermi\n6. Visitare i carcerati\n7. Seppellire i morti";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(163));

		item = new Item();
		item.title = "Le sette opere di misericordia spirituale";
		item.intro = "";
		item.content = "1. Consigliare i dubbiosi\n2. Insegnare agli ignoranti\n3. Ammonire i peccatori\n4. Consolare gli afflitti\n5. Perdonare le offese\n6. Sopportare pazientemente le persone moleste\n7. Pregare Dio per i vivi e per i morti";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(164));

		item = new Item();
		item.title = "I sette vizi capitali";
		item.intro = "";
		item.content = "1. Superbia\n2. Avarizia\n3. Lussuria\n4. Ira\n5. Gola\n6. Invidia\n7. Accidia";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(165));

		item = new Item();
		item.title = "I sei peccati contro lo Spirito Santo";
		item.intro = "";
		item.content = "1. Disperazione della salvezza\n2. presunzione di salvarsi senza merito\n3. Impugnare la verità conosciuta\n4. Invidia della grazia altrui\n5. Ostinazione nei peccati\n6. Impenitenza finale";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(166));

		item = new Item();
		item.title = "I quattro peccati che urlano vendetta al cospetto di Dio";
		item.intro = "";
		item.content = "1. Omicidio volontario;\n2. Peccato impuro contro natura\n3. Oppressione dei poveri\n4. Frode nella mercede agli operai";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(167));

		item = new Item();
		item.title = "I quattro Novissimi";
		item.intro = "";
		item.content = "1. Morte\n2. Giudizio\n3. Inferno\n4. Paradiso";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(168));

		item = new Item();
		item.title = "La Carità";
		item.intro = "La Carità è:";
		item.content = "1. longanime e benigna\n2. non invidia\n3. non si vanta e non si insuperbisce\n4. non rifiuta nessun servizio ai fratelli\n5. non cerca il proprio interesse\n6. non si irrita\n7. non tiene conto del male ricevuto\n8. non gode dell'ingiustizia, ma si rallegra della verità\n9. tutto scusa e tutto crede\n10. spera sempre e tutto sopporta\nS. Paolo - I Cor 13";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(169));

		category.addSubCategory(new Integer(21));
		categories.addElement(subCategory);

		subCategory = new Category();
		subCategory.title = "Richieste";
		subCategory.parentId = 18;

		item = new Item();
		item.title = "Per il dono della pace";
		item.intro = "";
		item.content = "Signore Gesù Cristo, tu che conosci la profondità del nostro cuore, la capacità di bene e di male che è in ogni uomo, insegnaci a perdonare e a chiedere perdono, ad avere pietà di noi stessi e degli altri. Ricordati delle nostre famiglie, benedette dal tuo amore, ma spesso segnate dalle divisioni, dai risentimenti e dall'odio. Signore Gesù Cristo, dona alle nostre case pace e risurrezione, custodiscile nel tuo Cuore, e mantienile unite con la forza del tuo amore. Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(170));

		item = new Item();
		item.title = "Per la riconciliazione degli sposi divisi";
		item.intro = "";
		item.content = "O Signore, donami un cuore grande nel perdono, che sappia riconoscere i miei possibili errori e dimenticare l’offesa e il dolore ricevuto per l’allontanamento di (mio marito/mia moglie). Infondi in me la forza del Tuo Amore, perché io possa amare per primo e continuare ad amare senza mai perdere la speranza. Tu sei padrone dei cuori: fa’ rivivere nei nostri cuori la Grazia del nostro Sacramento, aiutaci a riunirci insieme nella Tua Pace. E se mai io dovessi soffrire ancora, accetta la mia sofferenza come mezzo di purificazione e di eterna salvezza di ognuno di noi. O Maria e Giuseppe, che siete stati i fidanzati e gli sposi più perfetti, e che tuttavia siete stati sottoposti alla prova del vostro mutuo amore, pregate per noi, fate rinascere in me e (nome marito/moglie) il desiderio e l'impegno di riunire e salvare la nostra famiglia. Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(171));

		item = new Item();
		item.title = "Preghiera a San Raffaele";
		item.intro = "";
		item.content = "Divina guida, San Raffaele, tu che hai trovato una compagna di vita per il giovane Tobia, conducimi nei miei desideri e nelle mie incertezze. Pericoli e ostacoli possono essere sul mio cammino: sii la mia luce. Fa' che grazie alla tua potente intercessione, trovi colei/colui che Dio ha pensato per me, per fondare con lei/lui una vera unione cristiana, per rendere gloria a Dio e trovare la mia felicità quaggiù e nell'eternità.  ";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(172));

		item = new Item();
		item.title = "Preghiera dello studente";
		item.intro = "";
		item.content = "Ineffabile Creatore, dai tesori della tua sapienza traesti le tre gerarchie degli Angeli e in ordine mirabile le collocasti nel cielo e con splendida armonia disponesti le parti dell'universo. Tu sei la vera sorgente della luce e della sapienza e il Principio dal quale tutto dipende; degnati di infondere nella mia oscura intelligenza un raggio del tuo splendore che allontani da me le tenebre del peccato e dell'ignoranza. Tu che sciogli e fai parlare la lingua dei bimbi, ingentilisci la mia parola e da' alle mie labbra la grazia della tua benedizione. Dammi acutezza per intendere, capacità per ritenere, misura e facilità d'imparare, penetrazione di ciò che leggo, grazia di parola. Dammi forza per incominciare bene il mio studio; guidami lungo il corso della mia fatica; dammi felice compimento. Tu che sei vero Dio e vero uomo, Gesù mio Salvatore, che vivi e regni per sempre. Amen.\n(S.Tommaso d'Aquino) ";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(173));

		item = new Item();
		item.title = "Prima di un viaggio";
		item.intro = "";
		item.content = "Signore, che riempi ogni luogo con la tua presenza, accompagnami in questo viaggio. Fammi giungere alla mèta e tornare a casa sano e salvo. Il tuo angelo mi accompagni, mi difenda e mi faccia capire che tutta la vita è un grande viaggio. Fa', o Signore, che il mio viaggio sia un annuncio di gioia a tutti coloro che incontro, un messaggio di speranza, un dono di certezza, e io porti a tutti una testimonianza di vita cristiana. Mettiti in cammino con me, Signore, e fa' che questo mi prepari all'ultima mia partenza che mi schiuderà l'incontro con te, nel tuo regno. Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(174));

		item = new Item();
		item.title = "Per la Chiesa";
		item.intro = "";
		item.content = "O Dio, nostro Padre, tu hai voluto che la Chiesa continuasse nel mondo l'opera di Cristo e fosse il segno vivente di lui. Ti preghiamo che la Chiesa, che siamo noi, imiti il suo Capo. Come Cristo ha compiuto la redenzione attraverso la povertà e le persecuzioni, così anche la Chiesa prenda la stessa via per comunicare agli uomini i frutti della salvezza. Come Cristo è stato inviato da te, padre, a dare la buona notizia ai poveri, a cercare e salvare ciò che era perduto, così anche la Chiesa circondi di affettuosa cura quanti sono afflitti da umana debolezza e riconosca nei poveri l'immagine del suo Fondatore, povero e sofferente, e si metta il loro servizio con amore. Gesù Cristo, pur essendo Dio, spogliò se stesso prendendo la natura di servo, e per noi da ricco che era si fece povero. Così la Chiesa non cerchi la gloria della terra, ma diffonda l'umiltà e l'abnegazione. ti preghiamo per la Chiesa: trovi sempre in cristo risorto, vincitore della morte e del peccato, la forza per vincere con pazienza e amore le sue interne ed esterne difficoltà, e sveli al mondo con fedeltà perchè trovino il coraggio di verificare la vita alla luce dell'esempio di Maria.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(175));

		item = new Item();
		item.title = "Per il Papa";
		item.intro = "";
		item.content = "O Gesù, Re e Signore della Chiesa: rinnovo alla tua presenza la mia adesione incondizionata al tuo Vicario sulla terra, il Papa. In lui ci hai voluto mostrare il cammino sicuro e certo che dobbiamo seguire in mezzo al disorientamento, all’inquietudine e allo sgomento. Credo fermamente che per mezzo suo tu ci governi, istruisci e santifichi, e sotto il suo vincastro formiamo la vera Chiesa: una, santa, cattolica ed apostolica. Concedimi la grazia di amare, di vivere e di diffondere come figlio fedele i suoi insegnamenti. Custodisci la sua vita, illumina la sua intelligenza, fortifica il suo spirito, difendilo dalle calunnie e dalla malvagità. Placa i venti erosivi dell’infedeltà e della disobbedienza, e concedici che, attorno a lui, la tua Chiesa si conservi unita, ferma nel credere e nell’operare e sia così lo strumento della tua redenzione. Così sia.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(176));

		item = new Item();
		item.title = "Per i sacerdoti";
		item.intro = "";
		item.content = "O Gesù mio, ti prego per la Chiesa intera: concedile l'amore e la luce dei tuo Spirito, rendi efficaci le parole dei sacerdoti, affinché spezzino anche i cuori più induriti e li facciano ritornare a te, o Signore. Signore, dacci sacerdoti santi, e tu stesso conservali nella serenità. Fa' che la potenza della tua Misericordia li accompagni dovunque e li custodisca contro le insidie che il demonio non cessa di tendere all'anima di ogni sacerdote. La potenza della tua Misericordia, o Signore, distrugga tutto ciò che potrebbe offuscare la santità dei sacerdote, perché tu sei onnipotente. Ti chiedo, Gesù, di benedire con una luce speciale i sacerdoti dai quali mi confesserò nella mia vita. Amen.\n(Santa Faustina)";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(177));

		item = new Item();
		item.title = "Per l'Italia";
		item.intro = "";
		item.content = "O Dio, nostro Padre, ti lodiamo e ringraziamo. Tu che ami ogni uomo e guidi tutti i popoli accompagna i passi della nostra nazione spesso difficili ma colmi di speranza. Fa' che vediamo i segni della tua presenza e perimentiamo la forza del tuo amore. Che non viene mai meno. Signore Gesù, Figlio di Dio e Salvatore del mondo, fatto uomo nel seno della vergine Maria, ti confessiamo la nostra fede. Il tuo Vangelo sia luce e vigore per le nostre scelte personali e sociali. La tua legge d'amore conduca la nostra comunità civile a giustizia e solidarietà, a riconciliazione e pace. Spirito Santo, amore del Padre e del Figlio, con fiducia ti invochiamo. Tu che sei maestro interiore svela a noi i pensieri e le vie di Dio. Donaci di guardare le vicende umane con occhi puri e penetranti, di conservare l'eredità di santità e civiltà propria del nostro popolo, di convertirci nella mente e nel cuore per rinnovare la nostra società. Gloria a te, o Padre, che operi tutto in tutti. Gloria a te, o Figlio, che per amore ti sei fatto nostro servo. Gloria a te, o Spirito Santo, che semini i tuoi doni nei nostri cuori. Gloria a te, o Santa Trinità, che vivi e regni nei secoli dei secoli. Amen. ";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(178));

		item = new Item();
		item.title = "Per parenti e amici";
		item.intro = "";
		item.content = "O Dio onnipotente, Padre nostro, per l'intercessione di S. Giuseppe e di Maria Santissima, Ti prego per i miei famigliari, gli amici e anche i nemici. Proteggi tutti da ogni male, guida ogni loro scelta e decisione, affinché nella vita facciano sempre ciò che Ti è gradito. Dona loro salute, aumenta la loro fede, custodisci gli affetti famigliari e rendili testimoni di giustizia, lealtà e onestà. Fa' che nei momenti difficili Ti sentano vicino come Padre amorevole. Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(179));

		category.addSubCategory(new Integer(22));
		categories.addElement(subCategory);

		subCategory = new Category();
		subCategory.title = "Altri";
		subCategory.parentId = 18;

		item = new Item();
		item.title = "A pranzo";
		item.intro = "";
		item.content = "Il Re dell’eterna gloria ci faccia partecipi della mensa celeste. Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(180));

		item = new Item();
		item.title = "A cena";
		item.intro = "";
		item.content = "Il Re dell'eterna gloria ci conduca alla cena della vita eterna. Amen";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(181));

		item = new Item();
		item.title = "Ringraziamento";
		item.intro = "";
		item.content = "Ti rendiamo grazie, Dio onnipotente, per tutti i tuoi benefici, Tu che vivi e regni nei secoli dei secoli. Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(182));

		item = new Item();
		item.title = "Preghiera di un anziano";
		item.intro = "";
		item.content = "Benedetti quelli che mi guardano con simpatia.\nBenedetti quelli che comprendono il mio camminare stanco.\nBenedetti quelli che parlano a voce alta per minimizzare la mia sordità.\nBenedetti quelli che stringono con calore le mie mani tremanti.\nBenedetti quelli che si intessano della mia lontana giovinezza.\nBenedetti quelli che non si stancano di ascoltare i miei discorsi già tante volte ripetuti.\nBenedetti quelli che comprendono il mio bisogno di affetto.\nBenedetti quelli che mi regalano frammenti del loro tempo.\nBenedetti quelli che si ricordano della mia solitudine.\nBenedetti quelli che mi sono vicini nella sofferenza.\nBeati quelli che rallegrano gli ultimi giorni della mia vita.\nBeati quelli che mi sono vicini nel momento del passaggio.\nQuando entrerò nella vita eterna mi ricorderò di loro presso il Signore Gesù Cristo.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(183));

		item = new Item();
		item.title = "Cantico di Zaccaria (Benedictus)";
		item.intro = "";
		item.content = "Benedetto il Signore, Dio di Israele, perché ha visitato e redento il suo popolo e ha suscitato per noi una salvezza potente nella casa di Davide suo servo, come aveva promesso per bocca dei suoi santi profeti di un tempo, salvezza dai nostri nemici e dalle mani di quanti ci odiano; così Egli ha concesso misericordia ai nostri padri e si è ricordato della sua Santa Alleanza, del giuramento fatto ad Abramo nostro padre di concederci, liberati dalle mani dei nemici, di servirlo senza timore in santità e giustizia al suo cospetto per tutti i nostri giorni. E tu, bambino, sarai chiamato profeta dell'Altissimo,perché andrai innanzi al Signore a preparargli le strade, per dare al suo popolo la conoscenza della salvezza nella remissione dei suoi peccati, grazie alla bontà misericordiosa del nostro Dio, per cui verrà a visitarci dall'alto un sole che sorge, per rischiarare quelli che stanno nelle tenebre e nell'ombra della morte, e dirigere i nostri passi sulla via della pace. ";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(184));

		item = new Item();
		item.title = "Magnificat";
		item.intro = "";
		item.content = "L'anima mia magnifica il Signore e il mio spirito esulta in Dio, mio salvatore, perché ha guardato l'umiltà della sua serva. D'ora in poi tutte le generazioni mi chiameranno beata. Grandi cose ha fatto in me l'Onnipotente e Santo è il suo nome: di generazione in generazione la sua misericordia si stende su quelli che lo temono. Ha spiegato la potenza del suo braccio, ha disperso i superbi nei pensieri del loro cuore; ha rovesciato i potenti dai troni, ha innalzato gli umili; ha ricolmato di beni gli affamati, ha rimandato i ricchi a mani vuote. Ha soccorso Israele, suo servo, ricordandosi della sua misericordia, come aveva promesso ai nostri padri, ad Abramo e alla sua discendenza, per sempre. Gloria al Padre e al Figlio e allo Spirito Santo. Come era nel principio, e ora e sempre nei secoli dei secoli. Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(185));

		item = new Item();
		item.title = "Cantico di Simeone";
		item.intro = "";
		item.content = "Ora lascia, o Signore, che il tuo servo vada in pace secondo la tua parola, perché i miei occhi hanno visto la tua salvezza, preparata da te davanti a tutti i popoli, luce per illuminare le genti e gloria del tuo popolo, Israele.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(186));

		item = new Item();
		item.title = "Coroncina della Divina Misericodria";
		item.intro = "";
		item.content = "Questa preghiera serve a placare la Mia ira. La reciterai per nove giorni con la comune corona del rosario nel modo seguente: prima reciterai il PADRE NOSTRO, l’AVE MARIA ed il CREDO; poi sui grani del PADRE NOSTRO, dirai le parole seguenti: Eterno Padre, Ti offro il Corpo e il Sangue, l’Anima e la Divinità del Tuo dilettissimo Figlio e Nostro Signore Gesù Cristo in espiazione dei nostri peccati e di quelli del mondo intero. Sui grani delle AVE MARIA reciterai le parole seguenti: Per la Sua dolorosa Passione, abbi misericordia di noi e del mondo intero. Infine reciterai tre volte queste parole: Santo Dio, Santo Forte, Santo Immortale: abbi pietà di noi e del mondo intero” (Diario, 476).";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(187));

		item = new Item();
		item.title = "Preghiera del Cybernauta";
		item.intro = "";
		item.content = "Signore, avevo voglia di viaggiare e di incontrare tanti fratelli e Tu me ne hai dato la possibilità... Grazie! Fa o Signore che i miei viaggi raggiungano sempre la loro meta: l' Amore. Se incontrerò nuovi amici, camminerò gioiosamente con loro incontro a Te. Se incontrerò delle persone che ti hanno smarrito cercherò di illuminarne la via del ritorno. Se mi ascolteranno godrò con loro, se non mi ascolteranno, pregherò per loro. Fa o Signore che Internet, questo potente mezzo di comunicazione sociale, aiuti la Chiesa a fare di tutti i popoli un popolo solo: la Tua Famiglia.\n(suor Carla Plotegher)";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(188));

		item = new Item();
		item.title = "I misteri del Santo Rosario";
		item.intro = "";
		item.content = "Misteri Gaudiosi\n1. L'Annunciazione dell'Angelo a Maria Vergine\n2. La Visita di Maria Santissima a Santa Elisabetta\n3. La Nascita di Gesù nella grotta di Betlemme\n4. Gesù viene presentato al Tempio da Maria e Giuseppe\n5. Il Ritrovamento di Gesù nel Tempio\n\nMisteri Luminosi\n1. Il Battesimo nel Giordano\n2. Le Nozze di Cana\n3. L'annuncio del Regno di Dio\n4. La Trasfigurazione\n5. L'Eucaristia\n\nMisteri Dolorosi \n1. L'agonia di Gesù nel Getsemani\n2. La flagellazione di Gesù\n3. L'incoronazione di spine\n4. Il viaggio al Calvario di Gesù carico della croce\n5. Gesù è crocifisso e muore in croce\n\nMisteri Gloriosi\n1. La risurrezione di Gesù\n2. L'ascensione di Gesù al cielo\n3. La discesa dello Spirito Santo nel Cenacolo\n4. L'Assunzione di Maria al cielo\n5. L'Incoronazione di Maria Regina del cielo e della terra";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(189));

		category.addSubCategory(new Integer(23));
		categories.addElement(subCategory);

		category = new Category();
		category.title = "Polski";
		category.parentId = 0;

		categories.addElement(category);
		topCategory.addSubCategory(new Integer(24));

		subCategory = new Category();
		subCategory.title = "Podstawowe";
		subCategory.parentId = 24;

		item = new Item();
		item.title = "Znak Krzyża Św.";
		item.intro = "";
		item.content = "W imię Ojca i Syna, i Ducha Świętego. Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(190));

		item = new Item();
		item.title = "Chwała Ojcu";
		item.intro = "";
		item.content = "Chwała Ojcu i Synowi i Duchowi Świętemu, jak była na początku, teraz i zawsze i na wieki wieków. Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(191));

		item = new Item();
		item.title = "Skład apostolski";
		item.intro = "";
		item.content = "Wierzę w Boga Ojca wszechmogącego, Stworzyciela nieba i ziemi. I w Jezusa Chrystusa Syna Jego Jedynego, Pana naszego, który się począł z Ducha Świętego, narodził się z Maryi Panny; umęczon pod Ponckim Piłatem, ukrzyżowan, umarł i pogrzebion; zstąpił do piekieł; trzeciego dnia zmartwychwstał; wstąpił na niebiosa, siedzi po prawicy Boga Ojca wszechmogącego stamtąd przyjdzie sądzić żywych i umarłych. Wierzę w Ducha Świętego, święty Kościół powszechny, Świętych obcowanie, grzechów odpuszczenie, ciała zmartwychwstanie, żywot wieczny. Amen.\n		";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(192));

		item = new Item();
		item.title = "Ojcze nasz";
		item.intro = "";
		item.content = "Ojcze nasz, któryś jest w niebie, święć się Imię Twoje, przyjdź Królestwo Twoje. Bądź wola Twoja, jako w niebie tak i na ziemi. Chleba naszego powszedniego daj nam dzisiaj. I odpuść nam nasze winy, jako i my odpuszczamy naszym winowajcom. I nie wódź nas na pokuszenie, ale nas zbaw ode złego. Amen.\n		";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(193));

		item = new Item();
		item.title = "Ojcze nasz łacina";
		item.intro = "";
		item.content = "Pater noster, qui es in caelis: sanctificetur nomen tuum; adveniat regnum tuum;fiat voluntas tua, sicut in caelo, et in terra. Panem nostrum cotidianum da nobis hodie; et dimitte nobis debita nostra, sicut et nos dimtitimus debitóribus nostris; et ne nos inducas in tentatiónem; sed libera nos a malo. Amen.\n		";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(194));

		item = new Item();
		item.title = "Zdrowaś Maryjo";
		item.intro = "";
		item.content = "Zdrowaś Maryjo, łaski pełna, Pan z Tobą, błogosławionaś Ty między niewiastami i błogosławiony owoc żywota Twojego, Jezus. Święta Maryjo, Matko Boża, módl się za nami grzesznymi, teraz i w godzinę śmierci naszej. Amen.\n		";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(195));

		item = new Item();
		item.title = "Pod Twoją obronę";
		item.intro = "";
		item.content = "Pod Twoją obronę uciekamy się, święta Boża Rodzicielko. Naszymi prośbami racz nie gardzić w potrzebach naszych, ale od wszelakich złych przygód racz nas zawsze wybawiać, Panno chwalebna i błogosławiona. O Pani nasza, Orędowniczko nasza, Pośredniczko nasza, Pocieszycielko nasza. Z Synem swoim nas pojednaj, Synowi swojemu nas polecaj, swojemu Synowi nas oddawaj.\n		";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(196));

		item = new Item();
		item.title = "Do św. Michała Archanioła";
		item.intro = "";
		item.content = "Święty Michale Archaniele, który w brzasku swego istnienia wybrałeś Boga i całkowicie oddałeś się spełnianiu Jego świętej woli, wstaw się za mną do Stwórcy, abym dzisiaj, za Twoim przykładem, na początku nowego dnia, otwierając się na działanie Ducha Świętego, w każdej chwili oddawał się Bogu, wypełniając z miłością Jego świętą wolę. Niech razem z Tobą wołam bez ustanku: Któż jak Bóg! Przez Chrystusa Pana naszego. Amen.\n        ";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(197));

		item = new Item();
		item.title = "Aniele Boży";
		item.intro = "";
		item.content = "Aniele Boży, Stróżu mój, Ty zawsze przy mnie stój. Rano, wieczór, we dnie, w nocy, bądź mi zawsze ku pomocy. Broń mnie od wszelkiego złego i doprowadź do żywota wiecznego. Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(198));

		item = new Item();
		item.title = "Anioł Pański";
		item.intro = "";
		item.content = "K. Anioł Pański zwiastował Pannie Maryi.\nW. I poczęła z Ducha świętego. Zdrowaś Maryjo...\nK. Oto ja służebnica Pańska.\nW. Niech mi się stanie według słowa Twego-Zdrowaś Maryjo...\nK. A słowo stało się Ciałem.\nW. I mieszkało między nami. Zdrowaś Maryjo...\nK. Módl się za nami święta Boża Rodzicielko.\nW. Abyśmy się stali godnymi obietnic Chrystusowych.\nMódlmy się: Łaskę Twoją prosimy Cię, Panie, racz wlać w serca nasze, abyśmy którzy za zwiastowaniem anielskim Wcielenie Chrystusa, Syna Twego, poznali, przez mękę i krzyż do chwały zmartwychwstania byli doprowadzeni. Przez Chrystusa, Pana naszego. Amen.\n        ";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(199));

		category.addSubCategory(new Integer(25));
		categories.addElement(subCategory);

		subCategory = new Category();
		subCategory.title = "Studenckie";
		subCategory.parentId = 24;

		item = new Item();
		item.title = "Modlitwa studenta";
		item.intro = "";
		item.content = "Najlepszy Ojcze, Tobie w duchu pokory i dziecięcej ufności pragnę powierzyć wszystkie intencje środowiska akademickiego oraz moje własne. Wszechmogący Boże udzielaj nieustannie daru prawdziwej Mądrości i zdolności szukania Prawdy. Błogosław wszystkim profesorom, wykładowcom i tym, którzy w jakikolwiek sposób pomagają mi zgłębiać tajniki wiedzy; udzielaj im stale daru umiejętności, rozumu i umacniaj w nich poczucie odpowiedzialności za powierzone im osoby. Błogosław studentom; udzielaj im zapału, ochoty i sił do nauki. Panie, dziękuję Ci za to, że jestem studentem. Proszę, pomóż pamiętać, że studiowanie jest darem, który będzie służył innym. Błogosław wspólnocie Duszpasterstwa Akademickiego, wszystkim dobrym dziełom tej wspólnoty, niech służą wszystkim w poszukiwaniu prawdy i miłości. Błogosław kapłanom obdarz ich gorliwością w budowaniu Twojego Królestwa. Udziel mi Panie błogosławieństwa, bym swoje zamierzenia realizował zgodnie z Twoją wolą i trwał z innymi w duchu jedności. Przez Chrystusa, Pana naszego. Amen. 		";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(200));

		item = new Item();
		item.title = "O rozeznanie drogi życiowej";
		item.intro = "";
		item.content = "Panie, Ty znasz mnie. Nim przyszedłem na świat, wyznaczyłeś mi miejsce i zadanie do wykonania. Odsłoń przede mną Twoje zamierzenia, pomóż odnaleźć drogę, którą powinienem kroczyć, abym żyjąc według Twojego zamysłu, mógł stawać się coraz bardziej sobą. Proszę, pozwól mi odkryć moje powołanie, nabrać pewności co do sposobu życia, który dla mnie wybrałeś. Daj mi mądrość i siły, bym wypełnił Twoją wolę i ujrzał w niej źródło mego szczęścia w życiu doczesnym i wiecznym. Amen.\n		";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(201));

		item = new Item();
		item.title = "O miłość i czystość serca";
		item.intro = "";
		item.content = "Chryste, Panie, Ty znasz nas młodych ludzi. Spotkałeś ich wielu. Wiesz, że marzą o miłości, chyba większość z nas, i ja też. A przecież tak różnie można rozumieć miłość. Panie, Ty znasz nasze niespokojne serca i łatwość, z jaką wpadamy w namiętności przesłaniające czasem sens prawdziwej miłości. Otoczenie, w którym żyjemy, tak często wykoślawia miłość i ściąga ją w błoto. Dodaj nam siły w walce o zachowanie czystego i kochającego serca. Daj nam, Panie, czujność w zwalczaniu egoizmu, który tak łatwo się wkrada w nasze uczucia. Amen.\n		";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(202));

		item = new Item();
		item.title = "O dobrego męża";
		item.intro = "";
		item.content = "Ojcze mój Niebieski, jeżeli wolą Twoją jest, bym wyszła za mąż, żyje już gdzieś ten człowiek, który mnie szuka, z którym będę mogła się połączyć; ojciec moich dzieci. Otocz go opieką. Niech pozostanie czysty, opanowany i szlachetny - dla Ciebie i dla mnie. Amen.\n		";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(203));

		item = new Item();
		item.title = "O dobrą żonę";
		item.intro = "";
		item.content = "Panie Boże, Ojcze Niebieski. Ty widzisz całe me życie, Ty wiesz, że mieszka gdzieś dziewczyna, która kiedyś, gdy ze mną się spotka, opuści ojca i matkę, odda mi rękę i serce, abyśmy odtąd wzajemnie do siebie należeli. Otocz ją opieką. Niech pozostanie czysta, dobra i mądra - dla Ciebie i dla mnie. Amen.\n		";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(204));

		item = new Item();
		item.title = "Za narzeczoną";
		item.intro = "";
		item.content = "Panie Jezu, proszę Cię za moją dziewczynę. Błogosław jej i rozwiń w niej doskonałą, dojrzałą miłość. Niech dobrze przygotuje się do roli żony i matki. Daj, żeby była ze mną szczęśliwa i aby mogła się na mnie oprzeć. Dopomóż mi osłonić jej niewinność. Nie dopuść, żebym ją kiedykolwiek skrzywdził. Niech czuje się ze mną dobrze. Pomóż mi doprowadzić ją lepszą i piękniejszą duchowo do wiecznego szczęścia. Chroń ją od próżności i wszelkich pokus. Spraw, by mi była wierna i żeby mnie kochała Twoją miłością. Amen.\n		";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(205));

		item = new Item();
		item.title = "Za narzeczonego";
		item.intro = "";
		item.content = "Panie Jezu, postawiłeś na mej drodze człowieka, któremu pragnę oddać moje serce i z którym chcę na zawsze związać moje życie. Broń go od niebezpieczeństw. Spraw, aby w Tobie osiągnął swoją życiową dojrzałość. Uczyń go prawym, mądrym i dobrym. Daj mu serce mężne, aby nie obawiał się trudności, lecz przełamywał je w Twoje Imię. Daj mu siłę, aby miał silną wolę, potrafił panować nad sobą i dobrze służyć rodzinie. Uformuj w nim postawę ojcowską, żeby znalazł szczęście w obdarowywaniu swoich najbliższych, żeby nie szukał siebie, ale opiekował się tymi, których mu powierzysz. Uczyń go narzędziem Twojej Opatrzności. Niech tak jak Ty opiekuje się słabymi i bezbronnymi. Niech odważnie staje w obronie każdego poczętego życia. Niech mnie i nasze dzieci prowadzi do Ciebie drogą pięknej miłości.\n		";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(206));

		item = new Item();
		item.title = "O humor";
		item.intro = "";
		item.content = "Zechciej mi dać zdrowy żołądek, Panie, a także nieco do jedzenia. Zechciej mi dać zdrowie ciała i umiejętność zachowania go. Zechciej mi dać świętą duszę, Panie, duszę, która ma stale na oku to, co jest dobre i czyste, ażeby w obliczu grzechu nie wpadała w strach, ale umiała znaleźć sposób przywrócenia wszystkim rzeczom należnego porządku. Zechciej mi dać duszę, której obca jest nuda, która nie zna szemrania, wzdychań i użaleń, i nie pozwól, ażebym kłopotał się zbyt wiele wokół tego panoszącego się czegoś, które nazywa się \"ja\". Panie obdarz mnie zmysłem humoru. Daj mi łaskę rozumienia się na żartach, ażebym zaznał w życiu trochę szczęścia, a i innych mógł nim obdarzyć. Amen.\n	św. Tomasz Morus\n		";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(207));

		item = new Item();
		item.title = "O czas na wszystko";
		item.intro = "";
		item.content = "Panie, daj mi każdego dnia czas, by się modlić; czas, by służyć i kochać, by pracować i tworzyć; czas, by nie robić nic i czas, by spokojnym być.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(208));

		category.addSubCategory(new Integer(26));
		categories.addElement(subCategory);

		subCategory = new Category();
		subCategory.title = "Zawierzeniowe";
		subCategory.parentId = 24;

		item = new Item();
		item.title = "Do Ducha Świętego";
		item.intro = "";
		item.content = "Boże, Duchu Święty, słodka miłości Ojca i Syna. Aby całkowicie należeć do Ciebie, oddaję Ci teraz i na zawsze: moje serce, moje ciało i duszę, moje siły i zdolności, moje cierpienia i radości, moje życie i śmierć. Oddaję Ci też wszystkich, którzy są mi drodzy i wszystko, czym jestem i co posiadam, abyś Ty sam mógł tym rozporządzać i panować nade mną swoją miłością, teraz i w wieczności. Amen.	\n		";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(209));

		item = new Item();
		item.title = "Na początek dnia";
		item.intro = "";
		item.content = "Boże Wszechmogący! Rozpoczynam dzień i myślę o Tobie. Chcę Cię dzisiaj szukać, poznawać i kochać. Drogi mojego życia skrzyżują się z drogami różnych ludzi, w których mogę dostrzec Ciebie i Tobie usłużyć. Mogę im także pokazać Ciebie. Pomóż mi by wszystkie moje dzisiejsze myśli, słowa i czyny wypływały z najprawdziwszej miłości. Amen.\n		";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(210));

		item = new Item();
		item.title = "Akt wiary";
		item.intro = "";
		item.content = "Wierzę w Ciebie, Boże żywy, W Trójcy jedyny, prawdziwy. Wierzę w coś Objawił Boże, Twe słowo mylić nie może.\n		";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(211));

		item = new Item();
		item.title = "Akt nadziei";
		item.intro = "";
		item.content = "Ufam Tobie, boś Ty wierny, Wszechmocny i miłosierny. Dasz mi grzechów odpuszczenie, Łaskę i wieczne zbawienie.\n		";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(212));

		item = new Item();
		item.title = "Akt miłości";
		item.intro = "";
		item.content = "Boże, choć Cię nie pojmuję, jednak nad wszystko miłuję. Nad wszystko, co jest stworzone, Boś Ty dobro nieskończone.\n		";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(213));

		item = new Item();
		item.title = "Akt żalu";
		item.intro = "";
		item.content = "Ach, żałuję za me złości jedynie dla Twej miłości. Bądź miłościw mnie grzesznemu, dla Ciebie odpuszczam bliźniemu.\n		";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(214));

		item = new Item();
		item.title = "Jezu, ufam Tobie";
		item.intro = "";
		item.content = "Najświętsze Serce Jezusa - zmiłuj się nad nami.\nTobie, Panie, zaufałem - nie zawstydzę się na wieki.\nNiepokalane serce Maryi - módl się za nami.\n        ";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(215));

		category.addSubCategory(new Integer(27));
		categories.addElement(subCategory);

		subCategory = new Category();
		subCategory.title = "Wstawiennicze";
		subCategory.parentId = 24;

		item = new Item();
		item.title = "Przed pracą";
		item.intro = "";
		item.content = "Panie Boże, Ty nakazałeś nam czynić ziemię sobie poddaną. Przystępując do pracy, chcę uczynić świat lepszym i w ten sposób stawać się dobrym, służyć Tobie i tym, dla których owoce tej pracy będą przeznaczone. Pomóż mi jak najlepiej wypełniać moje obowiązki, pozwól cieszyć się tym, co robię, i spraw, by to wszystko przyniosło pożytek teraz i w wieczności. Amen.\n        ";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(216));

		item = new Item();
		item.title = "Przed i po nauce";
		item.intro = "";
		item.content = "Duchu święty, który oświecasz serca i umysły nasze, dodaj nam ochoty i zdolności, aby ta nauka była dla nas pożytkiem doczesnym i wiecznym. Przez Chrystusa Pana naszego. Amen.\nDziękujemy Ci, Panie Boże, za światłość tej nauki, pragniemy abyśmy nią oświeceni, mogli Cię zawsze wielbić i wolę Twoją wypełniać na wieki. Przez Chrystusa Pana naszego. Amen.\n        ";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(217));

		item = new Item();
		item.title = "Przed podróżą";
		item.intro = "";
		item.content = "Na początku drogi stoję przed Tobą, miłosierny Boże, i pokornie proszę Cię o opiekę na czas podróży. Strzeż mojego wyjścia i powrotu, kieruj moimi krokami, by nigdy nie schodziły z Twoich ścieżek. Pozwól mi bezpiecznie dotrzeć do celu podróży, w którą teraz wyruszam, a także do celu mojego życia - do domu w niebie.\n	";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(218));

		item = new Item();
		item.title = "O mądrość";
		item.intro = "";
		item.content = "Boże ojców i Panie miłosierdzia, któryś wszystko uczynił swym słowem i w mądrości swojej stworzyłeś człowieka, daj mi mądrość, co z Tobą tron dzieli, wyślij ją z niebios, ześlij od tronu swej chwały, by będąc przy mnie, pracowała ze mną, i żebym poznał co Tobie jest miłe. Amen.\n	";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(219));

		item = new Item();
		item.title = "O uproszenie łask";
		item.intro = "";
		item.content = "za wstawiennictwem bł. s. Sancji\nBoże, Mądrości Przedwieczna, pomnij na żywą wiarę Służebnicy Twojej, Błogosławionej Sancji, tak spragnionej wiedzy i wrażliwej na piękno, a zarazem rozumiejącej, że być dobrym to więcej znaczy niż wiele umieć, i spraw, proszę Cię, niech studia moje wzbogacają mój umysł i uszlachetniaj moje serce, by coraz żarliwiej poznawało Twoją Prawdę. Przez Chrystusa, Pana Naszego. Amen.\n	";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(220));

		item = new Item();
		item.title = "Za Kościół";
		item.intro = "";
		item.content = "Wszechmogący, wieczny Boże, który w Chrystusie objawiłeś swoją chwałę wszystkim narodom, strzeż dzieła miłosierdzia, aby Kościół Twój, rozszerzony na cały świat, trwał z niewzruszoną wiarą w wyznawaniu Twojego imienia. Przez Chrystusa, Pana naszego. Amen.\n	";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(221));

		item = new Item();
		item.title = "Za kapłanów";
		item.intro = "";
		item.content = "Boże, Ty dla chwały swojego majestatu i dla zabawienia rodzaju ludzkiego ustanowiłeś Jednorodzonego Syna swojego najwyższym i wiecznym Kapłanem; spraw, aby ci, których On wybrał jako sługi i szafarzy swoich tajemnic, wiernie wykonywali powierzony im urząd. Przez Chrystusa, Pana naszego. Amen.\n	";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(222));

		item = new Item();
		item.title = "Za zmarłych";
		item.intro = "";
		item.content = "Prosimy Cię, Panie, okaż wiekuiste miłosierdzie duszom sług i służebnic swoich, aby na wieki cieszyły się owocami wyznawanej wiary i pokładanej w Tobie nadziei. Przez Chrystusa, Pana naszego. Amen.	\n	";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(223));

		item = new Item();
		item.title = "Za Papieża";
		item.intro = "";
		item.content = "Boże, Pasterzu i Rządco wszystkich wiernych, wejrzyj łaskawie na sługę swojego Benedykta XVI, którego ustanowiłeś pasterzem Twojego Kościoła; daj mu słowem i przykładem przyczyniać się do dobra tych, którym przewodzi, aby razem z powierzoną sobie owczarnią osiągnął życie wieczne. Przez Chrystusa, Pana naszego. Amen.\n        ";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(224));

		item = new Item();
		item.title = "Za rodziców";
		item.intro = "";
		item.content = "Dobry Boże, dziękuję i proszę za moich rodziców. Wiele im zawdzięczam: troskę o moje życie, zdrowie, wykształcenie i wychowanie. Dzięki nim zostałem ochrzczony - cieszę się z tego, Wiem, że rodzicom nie raz było ciężko w życiu, a jednak starali się zapewnić mi jak najwięcej dobrego. Boże spraw, abym umiał być im za wszystko wdzięczny a łaską swoją wynagródź ich znojny trud. Naucz mnie rozumieć ich, gdy są zmęczeni i mają kłopoty. Daj im zdrowie i siły oraz błogosław wszystkim ich wysiłkom. Proszę Cię też o pokój i miłość w mojej rodzinie. Przez Chrystusa, Pana naszego. Amen.\n	";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(225));

		item = new Item();
		item.title = "Za chorych";
		item.intro = "";
		item.content = "Wszechmogący, wieczny Boże, wiekuisty lekarzu wierzących, wysłuchaj nasze prośby zanoszone za chorego, dla którego wypraszamy Twoje zmiłowanie, aby odzyskawszy zdrowie złożył Ci dziękczynienie w Twoim Kościele. Przez Chrystusa, pana naszego. Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(226));

		category.addSubCategory(new Integer(28));
		categories.addElement(subCategory);

		subCategory = new Category();
		subCategory.title = "Katechizm";
		subCategory.parentId = 24;

		item = new Item();
		item.title = "Dziesięć przykazań Bożych";
		item.intro = "";
		item.content = "Ja jestem Pan, twój Bóg, który cię wywiódł z ziemi egipskiej, z domu niewoli.\n1. Nie  będziesz  miał bogów  cudzych przede mną.\n2. Nie będziesz bral imienia Pana, Boga swego, nadaremnie.\n3. Pamiętaj, abyś dzień święty święcił.\n4. Czcij ojca swego i matkę swoją.\n5. Nie zabijaj.\n6. Nie cudzołóż.\n7. Nie kradnij.\n8. Nie mów fałszywego świadectwa przeciw bliźniemu swemu.\n9. Nie pożądaj żony bliźniego swego. \n10. Ani żadnej rzeczy, która jego jest.\nPrzykazania miłości\nBędziesz miłował Pana Boga twego z całego serca swego, z całej duszy swojej i ze wszystkich myśli swoich, a bliźniego swego jak siebie samego.\n		";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(227));

		item = new Item();
		item.title = "Błogosławieństwa ewangeliczne (Mt 5,3-12)";
		item.intro = "";
		item.content = "1. Błogosławieni ubodzy w duchu, albowiem do nich należy Królestwo niebieskie.\n2. Błogosławieni, którzy się smucą, albowiem oni będą pocieszeni.\n3. Błogosławieni cisi, albowiem oni na własność posiądą ziemię.\n4. Błogosławieni, którzy łakną i pragną sprawiedliwości, albowiem oni będą nasyceni.\n5. Błogosławieni miłosierni, albowiem oni miłosierdzia dostąpią.\n6. Błogosławieni czystego serca, albowiem oni Boga oglądać będą.\n7. Błogosławieni, którzy wprowadzają pokój, albowiem oni będą nazwani synami Bożymi.\n8. Błogosławieni, którzy cierpią prześladowanie dla sprawiedliwości, albowiem do nich należy Królestwo niebieskie. Błogosławieni jesteście, gdy ludzie wam urągają i prześladują was, i gdy z mego powodu mówią kłamliwie wszystko złe na was. Cieszcie się i radujcie, albowiem wasza nagroda wielka jest w niebie.\n		";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(228));

		item = new Item();
		item.title = "Przykazania kościelne";
		item.intro = "";
		item.content = "1. W niedzielę i święta nakazane uczestniczyć we Mszy świętej i powstrzymać się od prac niekoniecznych.\n2. Przynajmniej raz w roku przystąpić do sakramentu pokuty.\n3. Przynajmniej raz w roku, w okresie wielkanocnym, przyjąć Komunię świętą.\n4. Zachowywać nakazane posty i wstrzemięźliwość od pokarmów mięsnych, a w okresach pokuty powstrzymywać się od udziału w zabawach.\n5. Troszczyć się o potrzeby wspólnoty Kościoła.\n		";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(229));

		item = new Item();
		item.title = "Trzy cnoty Boskie";
		item.intro = "";
		item.content = "Wiara. Nadzieja. Miłość.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(230));

		item = new Item();
		item.title = "Cztery cnoty kardynalne";
		item.intro = "";
		item.content = "Roztropność. Sprawiedliwość. Umiarkowanie. Męstwo.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(231));

		item = new Item();
		item.title = "Siedem grzechów głównych";
		item.intro = "";
		item.content = "1. Pycha.\n2. Chciwość.\n3. Nieczystość.\n4. Zazdrość.\n5. Nieumiarkowanie w jedzeniu i piciu.\n6. Gniew.\n7. Lenistwo\n		";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(232));

		item = new Item();
		item.title = "Siedem cnót głównych";
		item.intro = "";
		item.content = "1. Pokora.\n2. Hojność.\n3. Czystość.\n4. Miłość.\n5 .Umiarkowanie.\n6. Cierpliwość.\n7. Gorliwość i pracowitość.\n		";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(233));

		item = new Item();
		item.title = "Warunki sakramentu pokuty";
		item.intro = "";
		item.content = "1. Rachunek sumienia.\n2. Żal za grzechy.\n3. Mocne postanowienie poprawy.\n4. Spowiedź szczera.\n5. Zadośćuczynienie Panu Bogu i bliźniemu.\n		";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(234));

		item = new Item();
		item.title = "Owoce Ducha Świętego";
		item.intro = "";
		item.content = "1. Miłość\n2. Radość\n3. Pokój\n4. Cierpliwość\n5. Uprzejmość\n6. Dobroć\n7. Wspaniałomyślność\n8. Łaskawość\n9. Wierność\n10. Skromność\n11. Wstrzemięźliwość\n12. Czystość\n		";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(235));

		category.addSubCategory(new Integer(29));
		categories.addElement(subCategory);

		subCategory = new Category();
		subCategory.title = "Inne";
		subCategory.parentId = 24;

		item = new Item();
		item.title = "Przed posiłkiem";
		item.intro = "";
		item.content = " Pobłogosław Panie Boże nas, pobłogosław ten posiłek i tych, którzy go przygotowali. Naucz nas dzielić się chlebem i radością ze wszystkimi, przez Chrystusa, Pana naszego. Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(236));

		item = new Item();
		item.title = "Po posiłku";
		item.intro = "";
		item.content = "Dziękujemy Ci Panie Boże, za te dary, które z Twojej dobroci spożywaliśmy. Przez Chrystusa, Pana naszego. Amen.";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(237));

		item = new Item();
		item.title = "Różaniec";
		item.intro = "";
		item.content = "Część I: TAJEMNICE RADOSNE\n1. Zwiastowanie.\n2. Nawiedzenie św. Elżbiety\n3. Narodzenie Pana Jezusa\n4. Ofiarowanie Pana Jezusa\n5. Znalezienie Pana Jezusa\nCzęść II: TAJEMNICE ŚWIATŁA\n1. Chrzest Pana Jezusa w Jordanie.\n2. Objawienie siebie na weselu w Kanie Galilejskiej.\n3. Wzywanie do nawrócenia i głoszenie Królestwa Bożego.\n4 .Przemienienie na Górze Tabor.\n5. Ustanowienie Eucharystii.\nCzęść III: TAJEMNICE BOLESNE\n1. Modlitwa Pana Jezusa w Ogrójcu.\n2. Biczowanie.\n3. Cierniem ukoronowanie.\n4. Niesienie Krzyża.\n5. Ukrzyżowanie.\nCzęść IV: TAJEMNICE CHWALEBNE\n1. Zmartwychwstanie.\n2. Wniebowstąpienie.\n3. Zesłanie Ducha Świętego.\n4. Wniebowzięcie NMP.\n5. Ukoronowanie NMP na Królową Nieba i Ziemi.\n		";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(238));

		item = new Item();
		item.title = "Koronka do Miłosierdzia Bożego";
		item.intro = "";
		item.content = "Ojcze nasz, Zdrowaś Maryjo, Wierzę w Boga.\nNa dużych paciorkach: Ojcze Przedwieczny, ofiaruję Ci Ciało i Krew, Duszę i Bóstwo najmilszego Syna Twojego, a Pana naszego Jezusa Chrystusa, na przebłaganie za grzechy nasze i całego świata.\nNa małych paciorkach:\nDla Jego bolesnej męki - miej miłosierdzie dla nas i całego świata.\nNa zakończenie:\nŚwięty Boże, Święty Mocny, święty a Nieśmiertelny, zmiłuj się nad nami i nad całym światem.(3x)\nO Krwi i Wodo, któraś wytrysnęła z Serca Jezusowego, jako zdrój miłosierdzia dla nas, ufamy Tobie!\n		";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(239));

		item = new Item();
		item.title = "Hymn św. Franciszka";
		item.intro = "";
		item.content = "Wielbimy Ciebie, wszechmocny I wielce dobry nasz Panie, Za wszystkich bytów istnienie Stworzonych Twoją mądrością. Chwalimy Ciebie za słońce, Naszego brata jasnego, Bo niesie w sobie Twój obraz I dzień ogrzewa swym żarem. Sławimy Ciebie za księżyc Wśród gwiazd krążący na niebie; Za wiatr i czyste powietrze, Za wodę, siostrę pokorną. Składamy dzięki za ogień, Radosny w swojej potędze; Za ziemię, matkę karmiącą, Za śmierć, co siostrą jest ciała. Niech wszystko to, co się stało Na Twoje słowo wszechwładne, Objawia Trójcy majestat I nas prowadzi ku Tobie. Amen. 		";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(240));

		item = new Item();
		item.title = "Magnificat - Pieśń Maryi (Łk 1 46-56)";
		item.intro = "";
		item.content = "Wielbi dusza moja Pana *\ni raduje się duch mój w Bogu, Zbawicielu moim.\nBo wejrzał na uniżenie swojej Służebnicy. *\nOto bowiem odtąd błogosławić mnie będą wszystkie pokolenia.\nGdyż wielkie rzeczy uczynił mi Wszechmocny, *\na Jego imię jest święte.\nJego miłosierdzie z pokolenia na pokolenie *\nnad tymi, którzy się Go boją.\nOkazał moc swego ramienia, *\nrozproszył pyszniących się zamysłami serc swoich.\nStrącił władców z tronu, *\na wywyższył pokornych.\nGłodnych nasycił dobrami, *\na bogatych z niczym odprawił.\nUjął się za swoim sługą, Izraelem, *\npomny na swe miłosierdzie,\nJak obiecał naszym ojcom, *\nAbrahamowi i jego potomstwu na wieki.\n		";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(241));

		item = new Item();
		item.title = "Benedictus - Pieśń Zachariasza (Łk 1, 68-79)";
		item.intro = "";
		item.content = "Błogosławiony Pan, Bóg Izraela, *\nbo lud swój nawiedził i wyzwolił.\nI wzbudził dla nas moc zbawczą *\nw domu swego sługi Dawida.\nJak zapowiedział od dawna *\nprzez usta swych świętych proroków,\nŻe nas wybawi od naszych nieprzyjaciół *\ni z ręki wszystkich, którzy nas nienawidzą;\nŻe naszym ojcom okaże miłosierdzie *\ni wspomni na swe święte przymierze,\nNa przysięgę, którą złożył *\nojcu naszemu Abrahamowi.\nDa nam, że z mocy nieprzyjaciół wyrwani, *\nsłużyć Mu będziemy bez trwogi,\nW pobożności i sprawiedliwości przed Nim *\npo wszystkie dni nasze.\nA ty, dziecię, zwać się będziesz prorokiem Najwyższego, *\ngdyż pójdziesz przed Panem przygotować Mu drogi.\nJego ludowi dasz poznać zbawienie *\nprzez odpuszczenie grzechów.\nDzięki serdecznej litości naszego Boga, *\nz jaką nas nawiedzi z wysoka Wschodzące Słońce,\nBy oświecić tych, co w mroku i cieniu śmierci mieszkają, *\naby nasze kroki skierować na drogę pokoju.\n		";
		item.details = "";
		items.addElement(item);
		subCategory.addItem(new Integer(242));

		category.addSubCategory(new Integer(30));
		categories.addElement(subCategory);

		category = new Category();
		category.title = "About";
		category.parentId = 0;

		categories.addElement(category);
		topCategory.addSubCategory(new Integer(31));

		item = new Item();
		item.title = "Help";
		item.intro = "";
		item.content = "Select language, then category and the prayer.";
		item.details = "";
		items.addElement(item);
		category.addItem(new Integer(243));

		item = new Item();
		item.title = "Authors";
		item.intro = "";
		item.content = "Mobile Prayerbook (c) Artur Polit 2010-2011\nwww.creocode.com\nartur@creocode.com\n\nPlease donate: http://creocode.com/donation\n\nEnglish and Italian prayers collected by A. Polit.\nLatin prayers: M.Marczak, J.L.Rivera, A.Polit\nItalian prayers: A. Polit\n\nPolish prayers based on:\nAbyście się wzjemnie miłowali - modlitewnik studenta\nCopyright Duszpasterstwo Akademickie w Polsce 2006\nhttp://www.swanna.waw.pl\nwith permission\n\nThanks for Arkadiusz Macudziński for providing application template.";
		item.details = "";
		items.addElement(item);
		category.addItem(new Integer(244));

	}
}
