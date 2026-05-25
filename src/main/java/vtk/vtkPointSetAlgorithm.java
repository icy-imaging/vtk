// java wrapper for vtkPointSetAlgorithm object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPointSetAlgorithm extends vtkAlgorithm
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
  public vtkPointSet GetOutput()
  {
    long temp = GetOutput_4();

    if (temp == 0) return null;
    return (vtkPointSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetOutput_5(int id0);
  public vtkPointSet GetOutput(int id0)
  {
    long temp = GetOutput_5(id0);

    if (temp == 0) return null;
    return (vtkPointSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPolyDataOutput_6();
  public vtkPolyData GetPolyDataOutput()
  {
    long temp = GetPolyDataOutput_6();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetStructuredGridOutput_7();
  public vtkStructuredGrid GetStructuredGridOutput()
  {
    long temp = GetStructuredGridOutput_7();

    if (temp == 0) return null;
    return (vtkStructuredGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetUnstructuredGridOutput_8();
  public vtkUnstructuredGrid GetUnstructuredGridOutput()
  {
    long temp = GetUnstructuredGridOutput_8();

    if (temp == 0) return null;
    return (vtkUnstructuredGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetInputData_9(vtkDataObject id0);
  public void SetInputData(vtkDataObject id0)
  {
    SetInputData_9(id0);
  }

  private native void SetInputData_10(int id0,vtkDataObject id1);
  public void SetInputData(int id0,vtkDataObject id1)
  {
    SetInputData_10(id0,id1);
  }

  private native void SetInputData_11(vtkPointSet id0);
  public void SetInputData(vtkPointSet id0)
  {
    SetInputData_11(id0);
  }

  private native void SetInputData_12(int id0,vtkPointSet id1);
  public void SetInputData(int id0,vtkPointSet id1)
  {
    SetInputData_12(id0,id1);
  }

  private native void AddInputData_13(vtkDataObject id0);
  public void AddInputData(vtkDataObject id0)
  {
    AddInputData_13(id0);
  }

  private native void AddInputData_14(vtkPointSet id0);
  public void AddInputData(vtkPointSet id0)
  {
    AddInputData_14(id0);
  }

  private native void AddInputData_15(int id0,vtkPointSet id1);
  public void AddInputData(int id0,vtkPointSet id1)
  {
    AddInputData_15(id0,id1);
  }

  private native void AddInputData_16(int id0,vtkDataObject id1);
  public void AddInputData(int id0,vtkDataObject id1)
  {
    AddInputData_16(id0,id1);
  }

  private native long GetInput_17();
  public vtkDataObject GetInput()
  {
    long temp = GetInput_17();

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkPointSetAlgorithm() { super(); }

  public vtkPointSetAlgorithm(long id) { super(id); }
  public native long   VTKInit();

}
