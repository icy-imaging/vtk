// java wrapper for vtkHyperTreeGridAlgorithm object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkHyperTreeGridAlgorithm extends vtkAlgorithm
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

  private native long GetOutput_4();
  public vtkDataObject GetOutput()
  {
    long temp = GetOutput_4();

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetOutput_5(int id0);
  public vtkDataObject GetOutput(int id0)
  {
    long temp = GetOutput_5(id0);

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetOutput_6(vtkDataObject id0);
  public void SetOutput(vtkDataObject id0)
  {
    SetOutput_6(id0);
  }

  private native long GetHyperTreeGridOutput_7();
  public vtkHyperTreeGrid GetHyperTreeGridOutput()
  {
    long temp = GetHyperTreeGridOutput_7();

    if (temp == 0) return null;
    return (vtkHyperTreeGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetHyperTreeGridOutput_8(int id0);
  public vtkHyperTreeGrid GetHyperTreeGridOutput(int id0)
  {
    long temp = GetHyperTreeGridOutput_8(id0);

    if (temp == 0) return null;
    return (vtkHyperTreeGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPolyDataOutput_9();
  public vtkPolyData GetPolyDataOutput()
  {
    long temp = GetPolyDataOutput_9();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPolyDataOutput_10(int id0);
  public vtkPolyData GetPolyDataOutput(int id0)
  {
    long temp = GetPolyDataOutput_10(id0);

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetUnstructuredGridOutput_11();
  public vtkUnstructuredGrid GetUnstructuredGridOutput()
  {
    long temp = GetUnstructuredGridOutput_11();

    if (temp == 0) return null;
    return (vtkUnstructuredGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetUnstructuredGridOutput_12(int id0);
  public vtkUnstructuredGrid GetUnstructuredGridOutput(int id0)
  {
    long temp = GetUnstructuredGridOutput_12(id0);

    if (temp == 0) return null;
    return (vtkUnstructuredGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetInputData_13(vtkDataObject id0);
  public void SetInputData(vtkDataObject id0)
  {
    SetInputData_13(id0);
  }

  private native void SetInputData_14(int id0,vtkDataObject id1);
  public void SetInputData(int id0,vtkDataObject id1)
  {
    SetInputData_14(id0,id1);
  }

  private native void AddInputData_15(vtkDataObject id0);
  public void AddInputData(vtkDataObject id0)
  {
    AddInputData_15(id0);
  }

  private native void AddInputData_16(int id0,vtkDataObject id1);
  public void AddInputData(int id0,vtkDataObject id1)
  {
    AddInputData_16(id0,id1);
  }

  public vtkHyperTreeGridAlgorithm() { super(); }

  public vtkHyperTreeGridAlgorithm(long id) { super(id); }

}
