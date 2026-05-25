// java wrapper for vtkPassSelectedArrays object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPassSelectedArrays extends vtkPassInputTypeAlgorithm
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

  private native void SetEnabled_4(boolean id0);
  public void SetEnabled(boolean id0)
  {
    SetEnabled_4(id0);
  }

  private native boolean GetEnabled_5();
  public boolean GetEnabled()
  {
    return GetEnabled_5();
  }

  private native void EnabledOn_6();
  public void EnabledOn()
  {
    EnabledOn_6();
  }

  private native void EnabledOff_7();
  public void EnabledOff()
  {
    EnabledOff_7();
  }

  private native long GetArraySelection_8(int id0);
  public vtkDataArraySelection GetArraySelection(int id0)
  {
    long temp = GetArraySelection_8(id0);

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPointDataArraySelection_9();
  public vtkDataArraySelection GetPointDataArraySelection()
  {
    long temp = GetPointDataArraySelection_9();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCellDataArraySelection_10();
  public vtkDataArraySelection GetCellDataArraySelection()
  {
    long temp = GetCellDataArraySelection_10();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetFieldDataArraySelection_11();
  public vtkDataArraySelection GetFieldDataArraySelection()
  {
    long temp = GetFieldDataArraySelection_11();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetVertexDataArraySelection_12();
  public vtkDataArraySelection GetVertexDataArraySelection()
  {
    long temp = GetVertexDataArraySelection_12();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetEdgeDataArraySelection_13();
  public vtkDataArraySelection GetEdgeDataArraySelection()
  {
    long temp = GetEdgeDataArraySelection_13();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetRowDataArraySelection_14();
  public vtkDataArraySelection GetRowDataArraySelection()
  {
    long temp = GetRowDataArraySelection_14();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkPassSelectedArrays() { super(); }

  public vtkPassSelectedArrays(long id) { super(id); }
  public native long   VTKInit();

}
