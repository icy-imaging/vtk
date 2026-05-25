// java wrapper for vtkMedicalImageProperties object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMedicalImageProperties extends vtkObject
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

  private native void Clear_4();
  public void Clear()
  {
    Clear_4();
  }

  private native void SetPatientName_5(byte[] id0, int len0);
  public void SetPatientName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPatientName_5(bytes0, bytes0.length);
  }

  private native byte[] GetPatientName_6();
  public String GetPatientName()
  {
    return new String(GetPatientName_6(), StandardCharsets.UTF_8);
  }

  private native void SetPatientID_7(byte[] id0, int len0);
  public void SetPatientID(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPatientID_7(bytes0, bytes0.length);
  }

  private native byte[] GetPatientID_8();
  public String GetPatientID()
  {
    return new String(GetPatientID_8(), StandardCharsets.UTF_8);
  }

  private native void SetPatientAge_9(byte[] id0, int len0);
  public void SetPatientAge(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPatientAge_9(bytes0, bytes0.length);
  }

  private native byte[] GetPatientAge_10();
  public String GetPatientAge()
  {
    return new String(GetPatientAge_10(), StandardCharsets.UTF_8);
  }

  private native int GetPatientAgeYear_11();
  public int GetPatientAgeYear()
  {
    return GetPatientAgeYear_11();
  }

  private native int GetPatientAgeMonth_12();
  public int GetPatientAgeMonth()
  {
    return GetPatientAgeMonth_12();
  }

  private native int GetPatientAgeWeek_13();
  public int GetPatientAgeWeek()
  {
    return GetPatientAgeWeek_13();
  }

  private native int GetPatientAgeDay_14();
  public int GetPatientAgeDay()
  {
    return GetPatientAgeDay_14();
  }

  private native void SetPatientSex_15(byte[] id0, int len0);
  public void SetPatientSex(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPatientSex_15(bytes0, bytes0.length);
  }

  private native byte[] GetPatientSex_16();
  public String GetPatientSex()
  {
    return new String(GetPatientSex_16(), StandardCharsets.UTF_8);
  }

  private native void SetPatientBirthDate_17(byte[] id0, int len0);
  public void SetPatientBirthDate(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPatientBirthDate_17(bytes0, bytes0.length);
  }

  private native byte[] GetPatientBirthDate_18();
  public String GetPatientBirthDate()
  {
    return new String(GetPatientBirthDate_18(), StandardCharsets.UTF_8);
  }

  private native int GetPatientBirthDateYear_19();
  public int GetPatientBirthDateYear()
  {
    return GetPatientBirthDateYear_19();
  }

  private native int GetPatientBirthDateMonth_20();
  public int GetPatientBirthDateMonth()
  {
    return GetPatientBirthDateMonth_20();
  }

  private native int GetPatientBirthDateDay_21();
  public int GetPatientBirthDateDay()
  {
    return GetPatientBirthDateDay_21();
  }

  private native void SetStudyDate_22(byte[] id0, int len0);
  public void SetStudyDate(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetStudyDate_22(bytes0, bytes0.length);
  }

  private native byte[] GetStudyDate_23();
  public String GetStudyDate()
  {
    return new String(GetStudyDate_23(), StandardCharsets.UTF_8);
  }

  private native void SetAcquisitionDate_24(byte[] id0, int len0);
  public void SetAcquisitionDate(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetAcquisitionDate_24(bytes0, bytes0.length);
  }

  private native byte[] GetAcquisitionDate_25();
  public String GetAcquisitionDate()
  {
    return new String(GetAcquisitionDate_25(), StandardCharsets.UTF_8);
  }

  private native int GetAcquisitionDateYear_26();
  public int GetAcquisitionDateYear()
  {
    return GetAcquisitionDateYear_26();
  }

  private native int GetAcquisitionDateMonth_27();
  public int GetAcquisitionDateMonth()
  {
    return GetAcquisitionDateMonth_27();
  }

  private native int GetAcquisitionDateDay_28();
  public int GetAcquisitionDateDay()
  {
    return GetAcquisitionDateDay_28();
  }

  private native void SetStudyTime_29(byte[] id0, int len0);
  public void SetStudyTime(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetStudyTime_29(bytes0, bytes0.length);
  }

  private native byte[] GetStudyTime_30();
  public String GetStudyTime()
  {
    return new String(GetStudyTime_30(), StandardCharsets.UTF_8);
  }

  private native void SetAcquisitionTime_31(byte[] id0, int len0);
  public void SetAcquisitionTime(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetAcquisitionTime_31(bytes0, bytes0.length);
  }

  private native byte[] GetAcquisitionTime_32();
  public String GetAcquisitionTime()
  {
    return new String(GetAcquisitionTime_32(), StandardCharsets.UTF_8);
  }

  private native void SetImageDate_33(byte[] id0, int len0);
  public void SetImageDate(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetImageDate_33(bytes0, bytes0.length);
  }

  private native byte[] GetImageDate_34();
  public String GetImageDate()
  {
    return new String(GetImageDate_34(), StandardCharsets.UTF_8);
  }

  private native int GetImageDateYear_35();
  public int GetImageDateYear()
  {
    return GetImageDateYear_35();
  }

  private native int GetImageDateMonth_36();
  public int GetImageDateMonth()
  {
    return GetImageDateMonth_36();
  }

  private native int GetImageDateDay_37();
  public int GetImageDateDay()
  {
    return GetImageDateDay_37();
  }

  private native int GetDateAsLocale_38(byte[] id0, int len0,byte[] id1, int len1);
  public int GetDateAsLocale(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return GetDateAsLocale_38(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  private native void SetImageTime_39(byte[] id0, int len0);
  public void SetImageTime(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetImageTime_39(bytes0, bytes0.length);
  }

  private native byte[] GetImageTime_40();
  public String GetImageTime()
  {
    return new String(GetImageTime_40(), StandardCharsets.UTF_8);
  }

  private native void SetImageNumber_41(byte[] id0, int len0);
  public void SetImageNumber(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetImageNumber_41(bytes0, bytes0.length);
  }

  private native byte[] GetImageNumber_42();
  public String GetImageNumber()
  {
    return new String(GetImageNumber_42(), StandardCharsets.UTF_8);
  }

  private native void SetSeriesNumber_43(byte[] id0, int len0);
  public void SetSeriesNumber(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetSeriesNumber_43(bytes0, bytes0.length);
  }

  private native byte[] GetSeriesNumber_44();
  public String GetSeriesNumber()
  {
    return new String(GetSeriesNumber_44(), StandardCharsets.UTF_8);
  }

  private native void SetSeriesDescription_45(byte[] id0, int len0);
  public void SetSeriesDescription(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetSeriesDescription_45(bytes0, bytes0.length);
  }

  private native byte[] GetSeriesDescription_46();
  public String GetSeriesDescription()
  {
    return new String(GetSeriesDescription_46(), StandardCharsets.UTF_8);
  }

  private native void SetStudyID_47(byte[] id0, int len0);
  public void SetStudyID(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetStudyID_47(bytes0, bytes0.length);
  }

  private native byte[] GetStudyID_48();
  public String GetStudyID()
  {
    return new String(GetStudyID_48(), StandardCharsets.UTF_8);
  }

  private native void SetStudyDescription_49(byte[] id0, int len0);
  public void SetStudyDescription(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetStudyDescription_49(bytes0, bytes0.length);
  }

  private native byte[] GetStudyDescription_50();
  public String GetStudyDescription()
  {
    return new String(GetStudyDescription_50(), StandardCharsets.UTF_8);
  }

  private native void SetModality_51(byte[] id0, int len0);
  public void SetModality(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetModality_51(bytes0, bytes0.length);
  }

  private native byte[] GetModality_52();
  public String GetModality()
  {
    return new String(GetModality_52(), StandardCharsets.UTF_8);
  }

  private native void SetManufacturer_53(byte[] id0, int len0);
  public void SetManufacturer(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetManufacturer_53(bytes0, bytes0.length);
  }

  private native byte[] GetManufacturer_54();
  public String GetManufacturer()
  {
    return new String(GetManufacturer_54(), StandardCharsets.UTF_8);
  }

  private native void SetManufacturerModelName_55(byte[] id0, int len0);
  public void SetManufacturerModelName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetManufacturerModelName_55(bytes0, bytes0.length);
  }

  private native byte[] GetManufacturerModelName_56();
  public String GetManufacturerModelName()
  {
    return new String(GetManufacturerModelName_56(), StandardCharsets.UTF_8);
  }

  private native void SetStationName_57(byte[] id0, int len0);
  public void SetStationName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetStationName_57(bytes0, bytes0.length);
  }

  private native byte[] GetStationName_58();
  public String GetStationName()
  {
    return new String(GetStationName_58(), StandardCharsets.UTF_8);
  }

  private native void SetInstitutionName_59(byte[] id0, int len0);
  public void SetInstitutionName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetInstitutionName_59(bytes0, bytes0.length);
  }

  private native byte[] GetInstitutionName_60();
  public String GetInstitutionName()
  {
    return new String(GetInstitutionName_60(), StandardCharsets.UTF_8);
  }

  private native void SetConvolutionKernel_61(byte[] id0, int len0);
  public void SetConvolutionKernel(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetConvolutionKernel_61(bytes0, bytes0.length);
  }

  private native byte[] GetConvolutionKernel_62();
  public String GetConvolutionKernel()
  {
    return new String(GetConvolutionKernel_62(), StandardCharsets.UTF_8);
  }

  private native void SetSliceThickness_63(byte[] id0, int len0);
  public void SetSliceThickness(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetSliceThickness_63(bytes0, bytes0.length);
  }

  private native byte[] GetSliceThickness_64();
  public String GetSliceThickness()
  {
    return new String(GetSliceThickness_64(), StandardCharsets.UTF_8);
  }

  private native double GetSliceThicknessAsDouble_65();
  public double GetSliceThicknessAsDouble()
  {
    return GetSliceThicknessAsDouble_65();
  }

  private native void SetKVP_66(byte[] id0, int len0);
  public void SetKVP(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetKVP_66(bytes0, bytes0.length);
  }

  private native byte[] GetKVP_67();
  public String GetKVP()
  {
    return new String(GetKVP_67(), StandardCharsets.UTF_8);
  }

  private native void SetGantryTilt_68(byte[] id0, int len0);
  public void SetGantryTilt(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetGantryTilt_68(bytes0, bytes0.length);
  }

  private native byte[] GetGantryTilt_69();
  public String GetGantryTilt()
  {
    return new String(GetGantryTilt_69(), StandardCharsets.UTF_8);
  }

  private native double GetGantryTiltAsDouble_70();
  public double GetGantryTiltAsDouble()
  {
    return GetGantryTiltAsDouble_70();
  }

  private native void SetEchoTime_71(byte[] id0, int len0);
  public void SetEchoTime(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetEchoTime_71(bytes0, bytes0.length);
  }

  private native byte[] GetEchoTime_72();
  public String GetEchoTime()
  {
    return new String(GetEchoTime_72(), StandardCharsets.UTF_8);
  }

  private native void SetEchoTrainLength_73(byte[] id0, int len0);
  public void SetEchoTrainLength(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetEchoTrainLength_73(bytes0, bytes0.length);
  }

  private native byte[] GetEchoTrainLength_74();
  public String GetEchoTrainLength()
  {
    return new String(GetEchoTrainLength_74(), StandardCharsets.UTF_8);
  }

  private native void SetRepetitionTime_75(byte[] id0, int len0);
  public void SetRepetitionTime(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetRepetitionTime_75(bytes0, bytes0.length);
  }

  private native byte[] GetRepetitionTime_76();
  public String GetRepetitionTime()
  {
    return new String(GetRepetitionTime_76(), StandardCharsets.UTF_8);
  }

  private native void SetExposureTime_77(byte[] id0, int len0);
  public void SetExposureTime(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetExposureTime_77(bytes0, bytes0.length);
  }

  private native byte[] GetExposureTime_78();
  public String GetExposureTime()
  {
    return new String(GetExposureTime_78(), StandardCharsets.UTF_8);
  }

  private native void SetXRayTubeCurrent_79(byte[] id0, int len0);
  public void SetXRayTubeCurrent(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetXRayTubeCurrent_79(bytes0, bytes0.length);
  }

  private native byte[] GetXRayTubeCurrent_80();
  public String GetXRayTubeCurrent()
  {
    return new String(GetXRayTubeCurrent_80(), StandardCharsets.UTF_8);
  }

  private native void SetExposure_81(byte[] id0, int len0);
  public void SetExposure(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetExposure_81(bytes0, bytes0.length);
  }

  private native byte[] GetExposure_82();
  public String GetExposure()
  {
    return new String(GetExposure_82(), StandardCharsets.UTF_8);
  }

  private native void SetDirectionCosine_83(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetDirectionCosine(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetDirectionCosine_83(id0,id1,id2,id3,id4,id5);
  }

  private native void SetDirectionCosine_84(double id0[]);
  public void SetDirectionCosine(double id0[])
  {
    SetDirectionCosine_84(id0);
  }

  private native double[] GetDirectionCosine_85();
  public double[] GetDirectionCosine()
  {
    return GetDirectionCosine_85();
  }

  private native void AddUserDefinedValue_86(byte[] id0, int len0,byte[] id1, int len1);
  public void AddUserDefinedValue(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    AddUserDefinedValue_86(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  private native byte[] GetUserDefinedValue_87(byte[] id0, int len0);
  public String GetUserDefinedValue(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return new String(GetUserDefinedValue_87(bytes0, bytes0.length), StandardCharsets.UTF_8);
  }

  private native int GetNumberOfUserDefinedValues_88();
  public int GetNumberOfUserDefinedValues()
  {
    return GetNumberOfUserDefinedValues_88();
  }

  private native byte[] GetUserDefinedNameByIndex_89(int id0);
  public String GetUserDefinedNameByIndex(int id0)
  {
    return new String(GetUserDefinedNameByIndex_89(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetUserDefinedValueByIndex_90(int id0);
  public String GetUserDefinedValueByIndex(int id0)
  {
    return new String(GetUserDefinedValueByIndex_90(id0), StandardCharsets.UTF_8);
  }

  private native void RemoveAllUserDefinedValues_91();
  public void RemoveAllUserDefinedValues()
  {
    RemoveAllUserDefinedValues_91();
  }

  private native int AddWindowLevelPreset_92(double id0,double id1);
  public int AddWindowLevelPreset(double id0,double id1)
  {
    return AddWindowLevelPreset_92(id0,id1);
  }

  private native void RemoveWindowLevelPreset_93(double id0,double id1);
  public void RemoveWindowLevelPreset(double id0,double id1)
  {
    RemoveWindowLevelPreset_93(id0,id1);
  }

  private native void RemoveAllWindowLevelPresets_94();
  public void RemoveAllWindowLevelPresets()
  {
    RemoveAllWindowLevelPresets_94();
  }

  private native int GetNumberOfWindowLevelPresets_95();
  public int GetNumberOfWindowLevelPresets()
  {
    return GetNumberOfWindowLevelPresets_95();
  }

  private native int HasWindowLevelPreset_96(double id0,double id1);
  public int HasWindowLevelPreset(double id0,double id1)
  {
    return HasWindowLevelPreset_96(id0,id1);
  }

  private native int GetWindowLevelPresetIndex_97(double id0,double id1);
  public int GetWindowLevelPresetIndex(double id0,double id1)
  {
    return GetWindowLevelPresetIndex_97(id0,id1);
  }

  private native double[] GetNthWindowLevelPreset_98(int id0);
  public double[] GetNthWindowLevelPreset(int id0)
  {
    return GetNthWindowLevelPreset_98(id0);
  }

  private native void SetNthWindowLevelPresetComment_99(int id0,byte[] id1, int len1);
  public void SetNthWindowLevelPresetComment(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetNthWindowLevelPresetComment_99(id0,bytes1, bytes1.length);
  }

  private native byte[] GetNthWindowLevelPresetComment_100(int id0);
  public String GetNthWindowLevelPresetComment(int id0)
  {
    return new String(GetNthWindowLevelPresetComment_100(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetInstanceUIDFromSliceID_101(int id0,int id1);
  public String GetInstanceUIDFromSliceID(int id0,int id1)
  {
    return new String(GetInstanceUIDFromSliceID_101(id0,id1), StandardCharsets.UTF_8);
  }

  private native void SetInstanceUIDFromSliceID_102(int id0,int id1,byte[] id2, int len2);
  public void SetInstanceUIDFromSliceID(int id0,int id1,String id2)
  {
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    SetInstanceUIDFromSliceID_102(id0,id1,bytes2, bytes2.length);
  }

  private native int GetOrientationType_103(int id0);
  public int GetOrientationType(int id0)
  {
    return GetOrientationType_103(id0);
  }

  private native void SetOrientationType_104(int id0,int id1);
  public void SetOrientationType(int id0,int id1)
  {
    SetOrientationType_104(id0,id1);
  }

  private native byte[] GetStringFromOrientationType_105(int id0);
  public String GetStringFromOrientationType(int id0)
  {
    return new String(GetStringFromOrientationType_105(id0), StandardCharsets.UTF_8);
  }

  private native void DeepCopy_106(vtkMedicalImageProperties id0);
  public void DeepCopy(vtkMedicalImageProperties id0)
  {
    DeepCopy_106(id0);
  }

  public vtkMedicalImageProperties() { super(); }

  public vtkMedicalImageProperties(long id) { super(id); }
  public native long   VTKInit();

}
