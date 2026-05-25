// java wrapper for vtkNIFTIImageHeader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkNIFTIImageHeader extends vtkObject
{

  private native int IsTypeOf_0(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_0(bytes0, bytes0.length);
  }

  private native int IsA_1(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_1(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_2(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_2(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_3(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_3(bytes0, bytes0.length);
  }

  private native byte[] GetMagic_4();
  public String GetMagic()
  {
    return new String(GetMagic_4(), StandardCharsets.UTF_8);
  }

  private native long GetVoxOffset_5();
  public long GetVoxOffset()
  {
    return GetVoxOffset_5();
  }

  private native int GetDataType_6();
  public int GetDataType()
  {
    return GetDataType_6();
  }

  private native int GetBitPix_7();
  public int GetBitPix()
  {
    return GetBitPix_7();
  }

  private native long GetDim_8(int id0);
  public long GetDim(int id0)
  {
    return GetDim_8(id0);
  }

  private native double GetPixDim_9(int id0);
  public double GetPixDim(int id0)
  {
    return GetPixDim_9(id0);
  }

  private native void SetIntentCode_10(int id0);
  public void SetIntentCode(int id0)
  {
    SetIntentCode_10(id0);
  }

  private native int GetIntentCode_11();
  public int GetIntentCode()
  {
    return GetIntentCode_11();
  }

  private native void SetIntentName_12(byte[] id0, int len0);
  public void SetIntentName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetIntentName_12(bytes0, bytes0.length);
  }

  private native byte[] GetIntentName_13();
  public String GetIntentName()
  {
    return new String(GetIntentName_13(), StandardCharsets.UTF_8);
  }

  private native void SetIntentP1_14(double id0);
  public void SetIntentP1(double id0)
  {
    SetIntentP1_14(id0);
  }

  private native double GetIntentP1_15();
  public double GetIntentP1()
  {
    return GetIntentP1_15();
  }

  private native void SetIntentP2_16(double id0);
  public void SetIntentP2(double id0)
  {
    SetIntentP2_16(id0);
  }

  private native double GetIntentP2_17();
  public double GetIntentP2()
  {
    return GetIntentP2_17();
  }

  private native void SetIntentP3_18(double id0);
  public void SetIntentP3(double id0)
  {
    SetIntentP3_18(id0);
  }

  private native double GetIntentP3_19();
  public double GetIntentP3()
  {
    return GetIntentP3_19();
  }

  private native void SetSclSlope_20(double id0);
  public void SetSclSlope(double id0)
  {
    SetSclSlope_20(id0);
  }

  private native double GetSclSlope_21();
  public double GetSclSlope()
  {
    return GetSclSlope_21();
  }

  private native void SetSclInter_22(double id0);
  public void SetSclInter(double id0)
  {
    SetSclInter_22(id0);
  }

  private native double GetSclInter_23();
  public double GetSclInter()
  {
    return GetSclInter_23();
  }

  private native void SetCalMin_24(double id0);
  public void SetCalMin(double id0)
  {
    SetCalMin_24(id0);
  }

  private native double GetCalMin_25();
  public double GetCalMin()
  {
    return GetCalMin_25();
  }

  private native void SetCalMax_26(double id0);
  public void SetCalMax(double id0)
  {
    SetCalMax_26(id0);
  }

  private native double GetCalMax_27();
  public double GetCalMax()
  {
    return GetCalMax_27();
  }

  private native void SetSliceDuration_28(double id0);
  public void SetSliceDuration(double id0)
  {
    SetSliceDuration_28(id0);
  }

  private native double GetSliceDuration_29();
  public double GetSliceDuration()
  {
    return GetSliceDuration_29();
  }

  private native void SetTOffset_30(double id0);
  public void SetTOffset(double id0)
  {
    SetTOffset_30(id0);
  }

  private native double GetTOffset_31();
  public double GetTOffset()
  {
    return GetTOffset_31();
  }

  private native void SetSliceStart_32(long id0);
  public void SetSliceStart(long id0)
  {
    SetSliceStart_32(id0);
  }

  private native long GetSliceStart_33();
  public long GetSliceStart()
  {
    return GetSliceStart_33();
  }

  private native void SetSliceEnd_34(long id0);
  public void SetSliceEnd(long id0)
  {
    SetSliceEnd_34(id0);
  }

  private native long GetSliceEnd_35();
  public long GetSliceEnd()
  {
    return GetSliceEnd_35();
  }

  private native void SetSliceCode_36(int id0);
  public void SetSliceCode(int id0)
  {
    SetSliceCode_36(id0);
  }

  private native int GetSliceCode_37();
  public int GetSliceCode()
  {
    return GetSliceCode_37();
  }

  private native void SetXYZTUnits_38(int id0);
  public void SetXYZTUnits(int id0)
  {
    SetXYZTUnits_38(id0);
  }

  private native int GetXYZTUnits_39();
  public int GetXYZTUnits()
  {
    return GetXYZTUnits_39();
  }

  private native void SetDimInfo_40(int id0);
  public void SetDimInfo(int id0)
  {
    SetDimInfo_40(id0);
  }

  private native int GetDimInfo_41();
  public int GetDimInfo()
  {
    return GetDimInfo_41();
  }

  private native void SetDescrip_42(byte[] id0, int len0);
  public void SetDescrip(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetDescrip_42(bytes0, bytes0.length);
  }

  private native byte[] GetDescrip_43();
  public String GetDescrip()
  {
    return new String(GetDescrip_43(), StandardCharsets.UTF_8);
  }

  private native void SetAuxFile_44(byte[] id0, int len0);
  public void SetAuxFile(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetAuxFile_44(bytes0, bytes0.length);
  }

  private native byte[] GetAuxFile_45();
  public String GetAuxFile()
  {
    return new String(GetAuxFile_45(), StandardCharsets.UTF_8);
  }

  private native void SetQFormCode_46(int id0);
  public void SetQFormCode(int id0)
  {
    SetQFormCode_46(id0);
  }

  private native int GetQFormCode_47();
  public int GetQFormCode()
  {
    return GetQFormCode_47();
  }

  private native void SetSFormCode_48(int id0);
  public void SetSFormCode(int id0)
  {
    SetSFormCode_48(id0);
  }

  private native int GetSFormCode_49();
  public int GetSFormCode()
  {
    return GetSFormCode_49();
  }

  private native void SetQuaternB_50(double id0);
  public void SetQuaternB(double id0)
  {
    SetQuaternB_50(id0);
  }

  private native double GetQuaternB_51();
  public double GetQuaternB()
  {
    return GetQuaternB_51();
  }

  private native void SetQuaternC_52(double id0);
  public void SetQuaternC(double id0)
  {
    SetQuaternC_52(id0);
  }

  private native double GetQuaternC_53();
  public double GetQuaternC()
  {
    return GetQuaternC_53();
  }

  private native void SetQuaternD_54(double id0);
  public void SetQuaternD(double id0)
  {
    SetQuaternD_54(id0);
  }

  private native double GetQuaternD_55();
  public double GetQuaternD()
  {
    return GetQuaternD_55();
  }

  private native void SetQOffsetX_56(double id0);
  public void SetQOffsetX(double id0)
  {
    SetQOffsetX_56(id0);
  }

  private native double GetQOffsetX_57();
  public double GetQOffsetX()
  {
    return GetQOffsetX_57();
  }

  private native void SetQOffsetY_58(double id0);
  public void SetQOffsetY(double id0)
  {
    SetQOffsetY_58(id0);
  }

  private native double GetQOffsetY_59();
  public double GetQOffsetY()
  {
    return GetQOffsetY_59();
  }

  private native void SetQOffsetZ_60(double id0);
  public void SetQOffsetZ(double id0)
  {
    SetQOffsetZ_60(id0);
  }

  private native double GetQOffsetZ_61();
  public double GetQOffsetZ()
  {
    return GetQOffsetZ_61();
  }

  private native void SetSRowX_62(double id0,double id1,double id2,double id3);
  public void SetSRowX(double id0,double id1,double id2,double id3)
  {
    SetSRowX_62(id0,id1,id2,id3);
  }

  private native void SetSRowX_63(double id0[]);
  public void SetSRowX(double id0[])
  {
    SetSRowX_63(id0);
  }

  private native double[] GetSRowX_64();
  public double[] GetSRowX()
  {
    return GetSRowX_64();
  }

  private native void SetSRowY_65(double id0,double id1,double id2,double id3);
  public void SetSRowY(double id0,double id1,double id2,double id3)
  {
    SetSRowY_65(id0,id1,id2,id3);
  }

  private native void SetSRowY_66(double id0[]);
  public void SetSRowY(double id0[])
  {
    SetSRowY_66(id0);
  }

  private native double[] GetSRowY_67();
  public double[] GetSRowY()
  {
    return GetSRowY_67();
  }

  private native void SetSRowZ_68(double id0,double id1,double id2,double id3);
  public void SetSRowZ(double id0,double id1,double id2,double id3)
  {
    SetSRowZ_68(id0,id1,id2,id3);
  }

  private native void SetSRowZ_69(double id0[]);
  public void SetSRowZ(double id0[])
  {
    SetSRowZ_69(id0);
  }

  private native double[] GetSRowZ_70();
  public double[] GetSRowZ()
  {
    return GetSRowZ_70();
  }

  private native void Initialize_71();
  public void Initialize()
  {
    Initialize_71();
  }

  private native void DeepCopy_72(vtkNIFTIImageHeader id0);
  public void DeepCopy(vtkNIFTIImageHeader id0)
  {
    DeepCopy_72(id0);
  }

  public vtkNIFTIImageHeader() { super(); }

  public vtkNIFTIImageHeader(long id) { super(id); }
  public native long   VTKInit();

}
