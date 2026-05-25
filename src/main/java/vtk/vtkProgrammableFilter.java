// java wrapper for vtkProgrammableFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkProgrammableFilter extends vtkPassInputTypeAlgorithm
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

  private native void SetExecuteMethod_4( Object id0, byte[] id1, int len1);
  public void SetExecuteMethod( Object id0, String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetExecuteMethod_4(id0, bytes1, bytes1.length);
  }

  private native long GetPolyDataInput_5();
  public vtkPolyData GetPolyDataInput()
  {
    long temp = GetPolyDataInput_5();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetStructuredPointsInput_6();
  public vtkStructuredPoints GetStructuredPointsInput()
  {
    long temp = GetStructuredPointsInput_6();

    if (temp == 0) return null;
    return (vtkStructuredPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetStructuredGridInput_7();
  public vtkStructuredGrid GetStructuredGridInput()
  {
    long temp = GetStructuredGridInput_7();

    if (temp == 0) return null;
    return (vtkStructuredGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetUnstructuredGridInput_8();
  public vtkUnstructuredGrid GetUnstructuredGridInput()
  {
    long temp = GetUnstructuredGridInput_8();

    if (temp == 0) return null;
    return (vtkUnstructuredGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetRectilinearGridInput_9();
  public vtkRectilinearGrid GetRectilinearGridInput()
  {
    long temp = GetRectilinearGridInput_9();

    if (temp == 0) return null;
    return (vtkRectilinearGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetGraphInput_10();
  public vtkGraph GetGraphInput()
  {
    long temp = GetGraphInput_10();

    if (temp == 0) return null;
    return (vtkGraph)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetMoleculeInput_11();
  public vtkMolecule GetMoleculeInput()
  {
    long temp = GetMoleculeInput_11();

    if (temp == 0) return null;
    return (vtkMolecule)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetTableInput_12();
  public vtkTable GetTableInput()
  {
    long temp = GetTableInput_12();

    if (temp == 0) return null;
    return (vtkTable)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetHyperTreeGridInput_13();
  public vtkHyperTreeGrid GetHyperTreeGridInput()
  {
    long temp = GetHyperTreeGridInput_13();

    if (temp == 0) return null;
    return (vtkHyperTreeGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetCopyArrays_14(boolean id0);
  public void SetCopyArrays(boolean id0)
  {
    SetCopyArrays_14(id0);
  }

  private native boolean GetCopyArrays_15();
  public boolean GetCopyArrays()
  {
    return GetCopyArrays_15();
  }

  private native void CopyArraysOn_16();
  public void CopyArraysOn()
  {
    CopyArraysOn_16();
  }

  private native void CopyArraysOff_17();
  public void CopyArraysOff()
  {
    CopyArraysOff_17();
  }

  public vtkProgrammableFilter() { super(); }

  public vtkProgrammableFilter(long id) { super(id); }
  public native long   VTKInit();

}
