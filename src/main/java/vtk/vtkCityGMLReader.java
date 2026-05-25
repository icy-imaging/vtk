// java wrapper for vtkCityGMLReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCityGMLReader extends vtkMultiBlockDataSetAlgorithm
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

  private native void SetLOD_6(int id0);
  public void SetLOD(int id0)
  {
    SetLOD_6(id0);
  }

  private native int GetLODMinValue_7();
  public int GetLODMinValue()
  {
    return GetLODMinValue_7();
  }

  private native int GetLODMaxValue_8();
  public int GetLODMaxValue()
  {
    return GetLODMaxValue_8();
  }

  private native int GetLOD_9();
  public int GetLOD()
  {
    return GetLOD_9();
  }

  private native void SetUseTransparencyAsOpacity_10(int id0);
  public void SetUseTransparencyAsOpacity(int id0)
  {
    SetUseTransparencyAsOpacity_10(id0);
  }

  private native int GetUseTransparencyAsOpacity_11();
  public int GetUseTransparencyAsOpacity()
  {
    return GetUseTransparencyAsOpacity_11();
  }

  private native void UseTransparencyAsOpacityOn_12();
  public void UseTransparencyAsOpacityOn()
  {
    UseTransparencyAsOpacityOn_12();
  }

  private native void UseTransparencyAsOpacityOff_13();
  public void UseTransparencyAsOpacityOff()
  {
    UseTransparencyAsOpacityOff_13();
  }

  private native void SetNumberOfBuildings_14(int id0);
  public void SetNumberOfBuildings(int id0)
  {
    SetNumberOfBuildings_14(id0);
  }

  private native int GetNumberOfBuildings_15();
  public int GetNumberOfBuildings()
  {
    return GetNumberOfBuildings_15();
  }

  private native void SetBeginBuildingIndex_16(int id0);
  public void SetBeginBuildingIndex(int id0)
  {
    SetBeginBuildingIndex_16(id0);
  }

  private native int GetBeginBuildingIndex_17();
  public int GetBeginBuildingIndex()
  {
    return GetBeginBuildingIndex_17();
  }

  private native void SetEndBuildingIndex_18(int id0);
  public void SetEndBuildingIndex(int id0)
  {
    SetEndBuildingIndex_18(id0);
  }

  private native int GetEndBuildingIndex_19();
  public int GetEndBuildingIndex()
  {
    return GetEndBuildingIndex_19();
  }

  private native void SetField_20(vtkDataObject id0,byte[] id1, int len1,byte[] id2, int len2);
  public void SetField(vtkDataObject id0,String id1,String id2)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    SetField_20(id0,bytes1, bytes1.length,bytes2, bytes2.length);
  }

  public vtkCityGMLReader() { super(); }

  public vtkCityGMLReader(long id) { super(id); }
  public native long   VTKInit();

}
