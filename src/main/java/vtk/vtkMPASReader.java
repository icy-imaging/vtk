// java wrapper for vtkMPASReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMPASReader extends vtkUnstructuredGridAlgorithm
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

  private native void SetFileName_4(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_4(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_5();
  public String GetFileName()
  {
    return new String(GetFileName_5(), StandardCharsets.UTF_8);
  }

  private native int GetMaximumCells_6();
  public int GetMaximumCells()
  {
    return GetMaximumCells_6();
  }

  private native int GetMaximumPoints_7();
  public int GetMaximumPoints()
  {
    return GetMaximumPoints_7();
  }

  private native int GetNumberOfCellVars_8();
  public int GetNumberOfCellVars()
  {
    return GetNumberOfCellVars_8();
  }

  private native int GetNumberOfPointVars_9();
  public int GetNumberOfPointVars()
  {
    return GetNumberOfPointVars_9();
  }

  private native long GetOutput_10();
  public vtkUnstructuredGrid GetOutput()
  {
    long temp = GetOutput_10();

    if (temp == 0) return null;
    return (vtkUnstructuredGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetOutput_11(int id0);
  public vtkUnstructuredGrid GetOutput(int id0)
  {
    long temp = GetOutput_11(id0);

    if (temp == 0) return null;
    return (vtkUnstructuredGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetUseDimensionedArrayNames_12(boolean id0);
  public void SetUseDimensionedArrayNames(boolean id0)
  {
    SetUseDimensionedArrayNames_12(id0);
  }

  private native boolean GetUseDimensionedArrayNames_13();
  public boolean GetUseDimensionedArrayNames()
  {
    return GetUseDimensionedArrayNames_13();
  }

  private native void UseDimensionedArrayNamesOn_14();
  public void UseDimensionedArrayNamesOn()
  {
    UseDimensionedArrayNamesOn_14();
  }

  private native void UseDimensionedArrayNamesOff_15();
  public void UseDimensionedArrayNamesOff()
  {
    UseDimensionedArrayNamesOff_15();
  }

  private native int GetNumberOfPointArrays_16();
  public int GetNumberOfPointArrays()
  {
    return GetNumberOfPointArrays_16();
  }

  private native byte[] GetPointArrayName_17(int id0);
  public String GetPointArrayName(int id0)
  {
    return new String(GetPointArrayName_17(id0), StandardCharsets.UTF_8);
  }

  private native int GetPointArrayStatus_18(byte[] id0, int len0);
  public int GetPointArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetPointArrayStatus_18(bytes0, bytes0.length);
  }

  private native void SetPointArrayStatus_19(byte[] id0, int len0,int id1);
  public void SetPointArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPointArrayStatus_19(bytes0, bytes0.length,id1);
  }

  private native void DisableAllPointArrays_20();
  public void DisableAllPointArrays()
  {
    DisableAllPointArrays_20();
  }

  private native void EnableAllPointArrays_21();
  public void EnableAllPointArrays()
  {
    EnableAllPointArrays_21();
  }

  private native int GetNumberOfCellArrays_22();
  public int GetNumberOfCellArrays()
  {
    return GetNumberOfCellArrays_22();
  }

  private native byte[] GetCellArrayName_23(int id0);
  public String GetCellArrayName(int id0)
  {
    return new String(GetCellArrayName_23(id0), StandardCharsets.UTF_8);
  }

  private native int GetCellArrayStatus_24(byte[] id0, int len0);
  public int GetCellArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetCellArrayStatus_24(bytes0, bytes0.length);
  }

  private native void SetCellArrayStatus_25(byte[] id0, int len0,int id1);
  public void SetCellArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetCellArrayStatus_25(bytes0, bytes0.length,id1);
  }

  private native void DisableAllCellArrays_26();
  public void DisableAllCellArrays()
  {
    DisableAllCellArrays_26();
  }

  private native void EnableAllCellArrays_27();
  public void EnableAllCellArrays()
  {
    EnableAllCellArrays_27();
  }

  private native long GetNumberOfDimensions_28();
  public long GetNumberOfDimensions()
  {
    return GetNumberOfDimensions_28();
  }

  private native byte[] GetDimensionName_29(int id0);
  public String GetDimensionName(int id0)
  {
    return new String(GetDimensionName_29(id0), StandardCharsets.UTF_8);
  }

  private native long GetAllDimensions_30();
  public vtkStringArray GetAllDimensions()
  {
    long temp = GetAllDimensions_30();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetDimensionCurrentIndex_31(byte[] id0, int len0);
  public int GetDimensionCurrentIndex(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetDimensionCurrentIndex_31(bytes0, bytes0.length);
  }

  private native void SetDimensionCurrentIndex_32(byte[] id0, int len0,int id1);
  public void SetDimensionCurrentIndex(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetDimensionCurrentIndex_32(bytes0, bytes0.length,id1);
  }

  private native int GetDimensionSize_33(byte[] id0, int len0);
  public int GetDimensionSize(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetDimensionSize_33(bytes0, bytes0.length);
  }

  private native void SetVerticalDimension_34(byte[] id0, int len0);
  public void SetVerticalDimension(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetVerticalDimension_34(bytes0, bytes0.length);
  }

  private native byte[] GetVerticalDimension_35();
  public String GetVerticalDimension()
  {
    return new String(GetVerticalDimension_35(), StandardCharsets.UTF_8);
  }

  private native void SetVerticalLevel_36(int id0);
  public void SetVerticalLevel(int id0)
  {
    SetVerticalLevel_36(id0);
  }

  private native int GetVerticalLevel_37();
  public int GetVerticalLevel()
  {
    return GetVerticalLevel_37();
  }

  private native int[] GetVerticalLevelRange_38();
  public int[] GetVerticalLevelRange()
  {
    return GetVerticalLevelRange_38();
  }

  private native void SetLayerThickness_39(int id0);
  public void SetLayerThickness(int id0)
  {
    SetLayerThickness_39(id0);
  }

  private native int GetLayerThickness_40();
  public int GetLayerThickness()
  {
    return GetLayerThickness_40();
  }

  private native int[] GetLayerThicknessRange_41();
  public int[] GetLayerThicknessRange()
  {
    return GetLayerThicknessRange_41();
  }

  private native void SetCenterLon_42(int id0);
  public void SetCenterLon(int id0)
  {
    SetCenterLon_42(id0);
  }

  private native int[] GetCenterLonRange_43();
  public int[] GetCenterLonRange()
  {
    return GetCenterLonRange_43();
  }

  private native void SetProjectLatLon_44(boolean id0);
  public void SetProjectLatLon(boolean id0)
  {
    SetProjectLatLon_44(id0);
  }

  private native boolean GetProjectLatLon_45();
  public boolean GetProjectLatLon()
  {
    return GetProjectLatLon_45();
  }

  private native void SetIsAtmosphere_46(boolean id0);
  public void SetIsAtmosphere(boolean id0)
  {
    SetIsAtmosphere_46(id0);
  }

  private native boolean GetIsAtmosphere_47();
  public boolean GetIsAtmosphere()
  {
    return GetIsAtmosphere_47();
  }

  private native void SetIsZeroCentered_48(boolean id0);
  public void SetIsZeroCentered(boolean id0)
  {
    SetIsZeroCentered_48(id0);
  }

  private native boolean GetIsZeroCentered_49();
  public boolean GetIsZeroCentered()
  {
    return GetIsZeroCentered_49();
  }

  private native void SetShowMultilayerView_50(boolean id0);
  public void SetShowMultilayerView(boolean id0)
  {
    SetShowMultilayerView_50(id0);
  }

  private native boolean GetShowMultilayerView_51();
  public boolean GetShowMultilayerView()
  {
    return GetShowMultilayerView_51();
  }

  private native int CanReadFile_52(byte[] id0, int len0);
  public int CanReadFile(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return CanReadFile_52(bytes0, bytes0.length);
  }

  private native long GetMTime_53();
  public long GetMTime()
  {
    return GetMTime_53();
  }

  public vtkMPASReader() { super(); }

  public vtkMPASReader(long id) { super(id); }
  public native long   VTKInit();

}
