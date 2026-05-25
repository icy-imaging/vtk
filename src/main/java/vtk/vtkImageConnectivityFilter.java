// java wrapper for vtkImageConnectivityFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageConnectivityFilter extends vtkImageAlgorithm
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

  private native void SetSeedConnection_4(vtkAlgorithmOutput id0);
  public void SetSeedConnection(vtkAlgorithmOutput id0)
  {
    SetSeedConnection_4(id0);
  }

  private native long GetSeedConnection_5();
  public vtkAlgorithmOutput GetSeedConnection()
  {
    long temp = GetSeedConnection_5();

    if (temp == 0) return null;
    return (vtkAlgorithmOutput)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSeedData_6(vtkDataSet id0);
  public void SetSeedData(vtkDataSet id0)
  {
    SetSeedData_6(id0);
  }

  private native void SetStencilConnection_7(vtkAlgorithmOutput id0);
  public void SetStencilConnection(vtkAlgorithmOutput id0)
  {
    SetStencilConnection_7(id0);
  }

  private native long GetStencilConnection_8();
  public vtkAlgorithmOutput GetStencilConnection()
  {
    long temp = GetStencilConnection_8();

    if (temp == 0) return null;
    return (vtkAlgorithmOutput)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetStencilData_9(vtkImageStencilData id0);
  public void SetStencilData(vtkImageStencilData id0)
  {
    SetStencilData_9(id0);
  }

  private native void SetLabelScalarTypeToUnsignedChar_10();
  public void SetLabelScalarTypeToUnsignedChar()
  {
    SetLabelScalarTypeToUnsignedChar_10();
  }

  private native void SetLabelScalarTypeToShort_11();
  public void SetLabelScalarTypeToShort()
  {
    SetLabelScalarTypeToShort_11();
  }

  private native void SetLabelScalarTypeToUnsignedShort_12();
  public void SetLabelScalarTypeToUnsignedShort()
  {
    SetLabelScalarTypeToUnsignedShort_12();
  }

  private native void SetLabelScalarTypeToInt_13();
  public void SetLabelScalarTypeToInt()
  {
    SetLabelScalarTypeToInt_13();
  }

  private native byte[] GetLabelScalarTypeAsString_14();
  public String GetLabelScalarTypeAsString()
  {
    return new String(GetLabelScalarTypeAsString_14(), StandardCharsets.UTF_8);
  }

  private native void SetLabelScalarType_15(int id0);
  public void SetLabelScalarType(int id0)
  {
    SetLabelScalarType_15(id0);
  }

  private native int GetLabelScalarType_16();
  public int GetLabelScalarType()
  {
    return GetLabelScalarType_16();
  }

  private native void SetLabelModeToSeedScalar_17();
  public void SetLabelModeToSeedScalar()
  {
    SetLabelModeToSeedScalar_17();
  }

  private native void SetLabelModeToConstantValue_18();
  public void SetLabelModeToConstantValue()
  {
    SetLabelModeToConstantValue_18();
  }

  private native void SetLabelModeToSizeRank_19();
  public void SetLabelModeToSizeRank()
  {
    SetLabelModeToSizeRank_19();
  }

  private native byte[] GetLabelModeAsString_20();
  public String GetLabelModeAsString()
  {
    return new String(GetLabelModeAsString_20(), StandardCharsets.UTF_8);
  }

  private native void SetLabelMode_21(int id0);
  public void SetLabelMode(int id0)
  {
    SetLabelMode_21(id0);
  }

  private native int GetLabelMode_22();
  public int GetLabelMode()
  {
    return GetLabelMode_22();
  }

  private native void SetExtractionModeToSeededRegions_23();
  public void SetExtractionModeToSeededRegions()
  {
    SetExtractionModeToSeededRegions_23();
  }

  private native void SetExtractionModeToAllRegions_24();
  public void SetExtractionModeToAllRegions()
  {
    SetExtractionModeToAllRegions_24();
  }

  private native void SetExtractionModeToLargestRegion_25();
  public void SetExtractionModeToLargestRegion()
  {
    SetExtractionModeToLargestRegion_25();
  }

  private native byte[] GetExtractionModeAsString_26();
  public String GetExtractionModeAsString()
  {
    return new String(GetExtractionModeAsString_26(), StandardCharsets.UTF_8);
  }

  private native void SetExtractionMode_27(int id0);
  public void SetExtractionMode(int id0)
  {
    SetExtractionMode_27(id0);
  }

  private native int GetExtractionMode_28();
  public int GetExtractionMode()
  {
    return GetExtractionMode_28();
  }

  private native void SetLabelConstantValue_29(int id0);
  public void SetLabelConstantValue(int id0)
  {
    SetLabelConstantValue_29(id0);
  }

  private native int GetLabelConstantValue_30();
  public int GetLabelConstantValue()
  {
    return GetLabelConstantValue_30();
  }

  private native long GetNumberOfExtractedRegions_31();
  public long GetNumberOfExtractedRegions()
  {
    return GetNumberOfExtractedRegions_31();
  }

  private native long GetExtractedRegionLabels_32();
  public vtkIdTypeArray GetExtractedRegionLabels()
  {
    long temp = GetExtractedRegionLabels_32();

    if (temp == 0) return null;
    return (vtkIdTypeArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetExtractedRegionSizes_33();
  public vtkIdTypeArray GetExtractedRegionSizes()
  {
    long temp = GetExtractedRegionSizes_33();

    if (temp == 0) return null;
    return (vtkIdTypeArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetExtractedRegionSeedIds_34();
  public vtkIdTypeArray GetExtractedRegionSeedIds()
  {
    long temp = GetExtractedRegionSeedIds_34();

    if (temp == 0) return null;
    return (vtkIdTypeArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetExtractedRegionExtents_35();
  public vtkIntArray GetExtractedRegionExtents()
  {
    long temp = GetExtractedRegionExtents_35();

    if (temp == 0) return null;
    return (vtkIntArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetGenerateRegionExtents_36(int id0);
  public void SetGenerateRegionExtents(int id0)
  {
    SetGenerateRegionExtents_36(id0);
  }

  private native void GenerateRegionExtentsOn_37();
  public void GenerateRegionExtentsOn()
  {
    GenerateRegionExtentsOn_37();
  }

  private native void GenerateRegionExtentsOff_38();
  public void GenerateRegionExtentsOff()
  {
    GenerateRegionExtentsOff_38();
  }

  private native int GetGenerateRegionExtents_39();
  public int GetGenerateRegionExtents()
  {
    return GetGenerateRegionExtents_39();
  }

  private native void SetSizeRange_40(long id0,long id1);
  public void SetSizeRange(long id0,long id1)
  {
    SetSizeRange_40(id0,id1);
  }

  private native void SetSizeRange_41(long id0[]);
  public void SetSizeRange(long id0[])
  {
    SetSizeRange_41(id0);
  }

  private native long[]  GetSizeRange_42();
  public long[]  GetSizeRange()
  {
    return GetSizeRange_42();
  }

  private native void SetScalarRange_43(double id0,double id1);
  public void SetScalarRange(double id0,double id1)
  {
    SetScalarRange_43(id0,id1);
  }

  private native void SetScalarRange_44(double id0[]);
  public void SetScalarRange(double id0[])
  {
    SetScalarRange_44(id0);
  }

  private native double[] GetScalarRange_45();
  public double[] GetScalarRange()
  {
    return GetScalarRange_45();
  }

  private native void SetActiveComponent_46(int id0);
  public void SetActiveComponent(int id0)
  {
    SetActiveComponent_46(id0);
  }

  private native int GetActiveComponent_47();
  public int GetActiveComponent()
  {
    return GetActiveComponent_47();
  }

  public vtkImageConnectivityFilter() { super(); }

  public vtkImageConnectivityFilter(long id) { super(id); }
  public native long   VTKInit();

}
