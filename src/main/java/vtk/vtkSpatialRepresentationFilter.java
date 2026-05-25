// java wrapper for vtkSpatialRepresentationFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSpatialRepresentationFilter extends vtkMultiBlockDataSetAlgorithm
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

  private native void SetSpatialRepresentation_4(vtkLocator id0);
  public void SetSpatialRepresentation(vtkLocator id0)
  {
    SetSpatialRepresentation_4(id0);
  }

  private native long GetSpatialRepresentation_5();
  public vtkLocator GetSpatialRepresentation()
  {
    long temp = GetSpatialRepresentation_5();

    if (temp == 0) return null;
    return (vtkLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetMaximumLevel_6();
  public int GetMaximumLevel()
  {
    return GetMaximumLevel_6();
  }

  private native void AddLevel_7(int id0);
  public void AddLevel(int id0)
  {
    AddLevel_7(id0);
  }

  private native void ResetLevels_8();
  public void ResetLevels()
  {
    ResetLevels_8();
  }

  private native void SetGenerateLeaves_9(boolean id0);
  public void SetGenerateLeaves(boolean id0)
  {
    SetGenerateLeaves_9(id0);
  }

  private native boolean GetGenerateLeaves_10();
  public boolean GetGenerateLeaves()
  {
    return GetGenerateLeaves_10();
  }

  private native void GenerateLeavesOn_11();
  public void GenerateLeavesOn()
  {
    GenerateLeavesOn_11();
  }

  private native void GenerateLeavesOff_12();
  public void GenerateLeavesOff()
  {
    GenerateLeavesOff_12();
  }

  public vtkSpatialRepresentationFilter() { super(); }

  public vtkSpatialRepresentationFilter(long id) { super(id); }
  public native long   VTKInit();

}
