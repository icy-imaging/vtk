// java wrapper for vtkDataSetAlgorithm object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDataSetAlgorithm extends vtkAlgorithm
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
  public vtkDataSet GetOutput()
  {
    long temp = GetOutput_4();

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetOutput_5(int id0);
  public vtkDataSet GetOutput(int id0)
  {
    long temp = GetOutput_5(id0);

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInput_6();
  public vtkDataObject GetInput()
  {
    long temp = GetInput_6();

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPolyDataOutput_7();
  public vtkPolyData GetPolyDataOutput()
  {
    long temp = GetPolyDataOutput_7();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetStructuredPointsOutput_8();
  public vtkStructuredPoints GetStructuredPointsOutput()
  {
    long temp = GetStructuredPointsOutput_8();

    if (temp == 0) return null;
    return (vtkStructuredPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetImageDataOutput_9();
  public vtkImageData GetImageDataOutput()
  {
    long temp = GetImageDataOutput_9();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetStructuredGridOutput_10();
  public vtkStructuredGrid GetStructuredGridOutput()
  {
    long temp = GetStructuredGridOutput_10();

    if (temp == 0) return null;
    return (vtkStructuredGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetUnstructuredGridOutput_11();
  public vtkUnstructuredGrid GetUnstructuredGridOutput()
  {
    long temp = GetUnstructuredGridOutput_11();

    if (temp == 0) return null;
    return (vtkUnstructuredGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetRectilinearGridOutput_12();
  public vtkRectilinearGrid GetRectilinearGridOutput()
  {
    long temp = GetRectilinearGridOutput_12();

    if (temp == 0) return null;
    return (vtkRectilinearGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
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

  private native void SetInputData_15(vtkDataSet id0);
  public void SetInputData(vtkDataSet id0)
  {
    SetInputData_15(id0);
  }

  private native void SetInputData_16(int id0,vtkDataSet id1);
  public void SetInputData(int id0,vtkDataSet id1)
  {
    SetInputData_16(id0,id1);
  }

  private native void AddInputData_17(vtkDataObject id0);
  public void AddInputData(vtkDataObject id0)
  {
    AddInputData_17(id0);
  }

  private native void AddInputData_18(vtkDataSet id0);
  public void AddInputData(vtkDataSet id0)
  {
    AddInputData_18(id0);
  }

  private native void AddInputData_19(int id0,vtkDataSet id1);
  public void AddInputData(int id0,vtkDataSet id1)
  {
    AddInputData_19(id0,id1);
  }

  private native void AddInputData_20(int id0,vtkDataObject id1);
  public void AddInputData(int id0,vtkDataObject id1)
  {
    AddInputData_20(id0,id1);
  }

  public vtkDataSetAlgorithm() { super(); }

  public vtkDataSetAlgorithm(long id) { super(id); }
  public native long   VTKInit();

}
