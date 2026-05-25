// java wrapper for vtkAttributeDataToTableFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAttributeDataToTableFilter extends vtkTableAlgorithm
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

  private native void SetFieldAssociation_4(int id0);
  public void SetFieldAssociation(int id0)
  {
    SetFieldAssociation_4(id0);
  }

  private native int GetFieldAssociation_5();
  public int GetFieldAssociation()
  {
    return GetFieldAssociation_5();
  }

  private native void SetAddMetaData_6(boolean id0);
  public void SetAddMetaData(boolean id0)
  {
    SetAddMetaData_6(id0);
  }

  private native boolean GetAddMetaData_7();
  public boolean GetAddMetaData()
  {
    return GetAddMetaData_7();
  }

  private native void AddMetaDataOn_8();
  public void AddMetaDataOn()
  {
    AddMetaDataOn_8();
  }

  private native void AddMetaDataOff_9();
  public void AddMetaDataOff()
  {
    AddMetaDataOff_9();
  }

  private native void SetGenerateOriginalIds_10(boolean id0);
  public void SetGenerateOriginalIds(boolean id0)
  {
    SetGenerateOriginalIds_10(id0);
  }

  private native boolean GetGenerateOriginalIds_11();
  public boolean GetGenerateOriginalIds()
  {
    return GetGenerateOriginalIds_11();
  }

  private native void GenerateOriginalIdsOn_12();
  public void GenerateOriginalIdsOn()
  {
    GenerateOriginalIdsOn_12();
  }

  private native void GenerateOriginalIdsOff_13();
  public void GenerateOriginalIdsOff()
  {
    GenerateOriginalIdsOff_13();
  }

  private native void SetGenerateCellConnectivity_14(boolean id0);
  public void SetGenerateCellConnectivity(boolean id0)
  {
    SetGenerateCellConnectivity_14(id0);
  }

  private native boolean GetGenerateCellConnectivity_15();
  public boolean GetGenerateCellConnectivity()
  {
    return GetGenerateCellConnectivity_15();
  }

  private native void GenerateCellConnectivityOn_16();
  public void GenerateCellConnectivityOn()
  {
    GenerateCellConnectivityOn_16();
  }

  private native void GenerateCellConnectivityOff_17();
  public void GenerateCellConnectivityOff()
  {
    GenerateCellConnectivityOff_17();
  }

  public vtkAttributeDataToTableFilter() { super(); }

  public vtkAttributeDataToTableFilter(long id) { super(id); }
  public native long   VTKInit();

}
