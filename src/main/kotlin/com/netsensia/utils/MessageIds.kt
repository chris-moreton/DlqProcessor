package com.netsensia.utils

import java.util.*

val messageIds = listOf<UUID>(
UUID.fromString("0c36f8eb-f743-11ea-9cb7-55b173137b9e"),
UUID.fromString("28f1c0e2-f7fd-11ea-b7e9-1ffa1e2476b2"),
UUID.fromString("8e1b224d-f801-11ea-8627-6b1b20e78f0b"),
UUID.fromString("8127d734-f990-11ea-9cd1-27b3e76838c8"),
UUID.fromString("3808a15e-f68e-11ea-8d6a-9b9db2893c3a"),
UUID.fromString("391007c0-f8f1-11ea-ab1f-690ccdab6657"),
UUID.fromString("56f85732-f9a4-11ea-ab1f-690ccdab6657"),
UUID.fromString("631233a1-f9b7-11ea-9cd1-27b3e76838c8"),
UUID.fromString("88801811-f9be-11ea-9cd1-27b3e76838c8"),
UUID.fromString("d15c4765-f9af-11ea-ab1f-690ccdab6657"),
UUID.fromString("ae869ecb-f9bb-11ea-ab1f-690ccdab6657"),
UUID.fromString("6c57c9fb-f9b9-11ea-ab1f-690ccdab6657"),
UUID.fromString("63bf0d8b-f9a0-11ea-9cd1-27b3e76838c8"),
UUID.fromString("01dff7e4-f690-11ea-a9e3-65c994043f1b"),
UUID.fromString("a40ed4cf-f995-11ea-9cd1-27b3e76838c8"),
UUID.fromString("e1736397-f802-11ea-b7e9-1ffa1e2476b2"),
UUID.fromString("05f812cb-f9b2-11ea-9cd1-27b3e76838c8"),
UUID.fromString("62fdbd58-f999-11ea-9cd1-27b3e76838c8"),
UUID.fromString("5140da8e-f7fe-11ea-8627-6b1b20e78f0b"),
UUID.fromString("963c27bd-f7fe-11ea-b7e9-1ffa1e2476b2"),
UUID.fromString("f864882e-f9bb-11ea-ab1f-690ccdab6657"),
UUID.fromString("fa902f2c-f732-11ea-9cb7-55b173137b9e"),
UUID.fromString("217a995b-f9b9-11ea-9cd1-27b3e76838c8"),
UUID.fromString("182968b1-f99d-11ea-9cd1-27b3e76838c8"),
UUID.fromString("4a78afa7-f9a3-11ea-ab1f-690ccdab6657"),
UUID.fromString("b96a757c-f9b5-11ea-9cd1-27b3e76838c8"),
UUID.fromString("fad52fc3-f9ba-11ea-9cd1-27b3e76838c8"),
UUID.fromString("faa81e64-f9b5-11ea-ab1f-690ccdab6657"),
UUID.fromString("3e8748f3-f9bd-11ea-9cd1-27b3e76838c8"),
UUID.fromString("2a23f808-f800-11ea-8627-6b1b20e78f0b"),
UUID.fromString("28a3c248-f9bc-11ea-9cd1-27b3e76838c8"),
UUID.fromString("eddb6e82-f9bc-11ea-ab1f-690ccdab6657"),
UUID.fromString("8f9a8213-f9a1-11ea-9cd1-27b3e76838c8"),
UUID.fromString("0568b14f-f9b7-11ea-ab1f-690ccdab6657"),
UUID.fromString("6bcc1a53-f9bb-11ea-9cd1-27b3e76838c8"),
UUID.fromString("bbc10d9d-f9a6-11ea-ab1f-690ccdab6657"),
UUID.fromString("ab0a5e9c-f9bd-11ea-ab1f-690ccdab6657"),
UUID.fromString("6c9d573d-f997-11ea-9cd1-27b3e76838c8"),
UUID.fromString("977027f2-f9b8-11ea-9cd1-27b3e76838c8"),
UUID.fromString("0a613e43-f9a0-11ea-9cd1-27b3e76838c8"),
UUID.fromString("d7840616-f9b2-11ea-ab1f-690ccdab6657"),
UUID.fromString("588665f3-f9ae-11ea-9cd1-27b3e76838c8"),
UUID.fromString("c7cc2ef6-f992-11ea-9cd1-27b3e76838c8"),
UUID.fromString("2c4926d0-f99b-11ea-ab1f-690ccdab6657"),
UUID.fromString("dfcd3c42-f7fc-11ea-b7e9-1ffa1e2476b2"),
UUID.fromString("dae33028-f7fd-11ea-b7e9-1ffa1e2476b2"),
UUID.fromString("6741fbaa-f7ff-11ea-8627-6b1b20e78f0b"),
UUID.fromString("0282b498-f800-11ea-b7e9-1ffa1e2476b2"),
UUID.fromString("b3975862-f800-11ea-b7e9-1ffa1e2476b2"),
UUID.fromString("e97dd6d3-f803-11ea-8627-6b1b20e78f0b"),
UUID.fromString("dae3a0d9-f804-11ea-8627-6b1b20e78f0b"),
UUID.fromString("c3e1583f-f80d-11ea-b7e9-1ffa1e2476b2"),
UUID.fromString("ab39c15d-f812-11ea-8627-6b1b20e78f0b"),
UUID.fromString("1091bdfc-f820-11ea-8627-6b1b20e78f0b"),
UUID.fromString("9bd23d90-f820-11ea-8627-6b1b20e78f0b"),
UUID.fromString("983460d8-f821-11ea-b7e9-1ffa1e2476b2"),
UUID.fromString("69bdb51b-f825-11ea-b7e9-1ffa1e2476b2"),
UUID.fromString("cda321ff-f825-11ea-b7e9-1ffa1e2476b2"),
UUID.fromString("31e89d9d-f828-11ea-b7e9-1ffa1e2476b2"),
UUID.fromString("8eca14e4-f828-11ea-8627-6b1b20e78f0b"),
UUID.fromString("9c5bc984-f829-11ea-8627-6b1b20e78f0b"),
UUID.fromString("c0bdd5ce-f82b-11ea-b7e9-1ffa1e2476b2"),
UUID.fromString("a12027e0-f82c-11ea-b7e9-1ffa1e2476b2"),
UUID.fromString("6da5f171-f82d-11ea-8627-6b1b20e78f0b"),
UUID.fromString("69ea70fa-f8f1-11ea-ab1f-690ccdab6657"),
UUID.fromString("0bc5cda2-f8f5-11ea-ab1f-690ccdab6657"),
UUID.fromString("b0a4c841-f98f-11ea-9cd1-27b3e76838c8"),
UUID.fromString("db38fb5d-f991-11ea-9cd1-27b3e76838c8"),
UUID.fromString("057b3d1f-f994-11ea-9cd1-27b3e76838c8"),
UUID.fromString("e5d30143-f997-11ea-ab1f-690ccdab6657"),
UUID.fromString("e6d930ed-f998-11ea-ab1f-690ccdab6657"),
UUID.fromString("6ec2678b-f99c-11ea-ab1f-690ccdab6657"),
UUID.fromString("0fc10b49-f99e-11ea-ab1f-690ccdab6657"),
UUID.fromString("8357fff7-f99f-11ea-9cd1-27b3e76838c8"),
UUID.fromString("dafe3e6d-f9a0-11ea-ab1f-690ccdab6657"),
UUID.fromString("a05ae145-f9a2-11ea-9cd1-27b3e76838c8"),
UUID.fromString("122ebe50-f9a3-11ea-ab1f-690ccdab6657"),
UUID.fromString("dc4200ff-f9a3-11ea-ab1f-690ccdab6657"),
UUID.fromString("814fa867-f9a6-11ea-ab1f-690ccdab6657"),
UUID.fromString("1c058c39-f9af-11ea-ab1f-690ccdab6657"),
UUID.fromString("c4678e7f-f9b1-11ea-ab1f-690ccdab6657"),
UUID.fromString("4f8a5807-f9b3-11ea-ab1f-690ccdab6657"),
UUID.fromString("88f79384-f9b3-11ea-ab1f-690ccdab6657"),
UUID.fromString("f03c09f4-f9b3-11ea-9cd1-27b3e76838c8"),
UUID.fromString("3af5de6b-f9b5-11ea-ab1f-690ccdab6657"),
UUID.fromString("59aee676-f9b6-11ea-9cd1-27b3e76838c8"),
UUID.fromString("9ae58b79-f9b6-11ea-ab1f-690ccdab6657"),
UUID.fromString("cdbcea33-f9b8-11ea-ab1f-690ccdab6657"),
UUID.fromString("0edb7cf4-f9ba-11ea-ab1f-690ccdab6657"),
UUID.fromString("9aa1322a-f9ba-11ea-ab1f-690ccdab6657"),
UUID.fromString("0a221e6a-f9bb-11ea-9cd1-27b3e76838c8"),
UUID.fromString("882e7d75-f9bb-11ea-ab1f-690ccdab6657"),
UUID.fromString("9107da29-f9bc-11ea-9cd1-27b3e76838c8"),
UUID.fromString("d16c398c-f9bc-11ea-ab1f-690ccdab6657"),
UUID.fromString("7b15a5aa-f9be-11ea-ab1f-690ccdab6657"),
UUID.fromString("fb4be959-f9be-11ea-9cd1-27b3e76838c8")
)