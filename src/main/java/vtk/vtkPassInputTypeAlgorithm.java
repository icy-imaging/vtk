// java wrapper for vtkPassInputTypeAlgorithm object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPassInputTypeAlgorithm extends vtkAlgorithm
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

  private native long GetPolyDataOutput_6();
  public vtkPolyData GetPolyDataOutput()
  {
    long temp = GetPolyDataOutput_6();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetStructuredPointsOutput_7();
  public vtkStructuredPoints GetStructuredPointsOutput()
  {
    long temp = GetStructuredPointsOutput_7();

    if (temp == 0) return null;
    return (vtkStructuredPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetImageDataOutput_8();
  public vtkImageData GetImageDataOutput()
  {
    long temp = GetImageDataOutput_8();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetStructuredGridOutput_9();
  public vtkStructuredGrid GetStructuredGridOutput()
  {
    long temp = GetStructuredGridOutput_9();

    if (temp == 0) return null;
    return (vtkStructuredGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetUnstructuredGridOutput_10();
  public vtkUnstructuredGrid GetUnstructuredGridOutput()
  {
    long temp = GetUnstructuredGridOutput_10();

    if (temp == 0) return null;
    return (vtkUnstructuredGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetRectilinearGridOutput_11();
  public vtkRectilinearGrid GetRectilinearGridOutput()
  {
    long temp = GetRectilinearGridOutput_11();

    if (temp == 0) return null;
    return (vtkRectilinearGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetGraphOutput_12();
  public vtkGraph GetGraphOutput()
  {
    long temp = GetGraphOutput_12();

    if (temp == 0) return null;
    return (vtkGraph)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetMoleculeOutput_13();
  public vtkMolecule GetMoleculeOutput()
  {
    long temp = GetMoleculeOutput_13();

    if (temp == 0) return null;
    return (vtkMolecule)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetTableOutput_14();
  public vtkTable GetTableOutput()
  {
    long temp = GetTableOutput_14();

    if (temp == 0) return null;
    return (vtkTable)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetHyperTreeGridOutput_15();
  public vtkHyperTreeGrid GetHyperTreeGridOutput()
  {
    long temp = GetHyperTreeGridOutput_15();

    if (temp == 0) return null;
    return (vtkHyperTreeGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInput_16();
  public vtkDataObject GetInput()
  {
    long temp = GetInput_16();

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetInputData_17(vtkDataObject id0);
  public void SetInputData(vtkDataObject id0)
  {
    SetInputData_17(id0);
  }

  private native void SetInputData_18(int id0,vtkDataObject id1);
  public void SetInputData(int id0,vtkDataObject id1)
  {
    SetInputData_18(id0,id1);
  }

  private native void AddInputData_19(vtkDataObject id0);
  public void AddInputData(vtkDataObject id0)
  {
    AddInputData_19(id0);
  }

  private native void AddInputData_20(int id0,vtkDataObject id1);
  public void AddInputData(int id0,vtkDataObject id1)
  {
    AddInputData_20(id0,id1);
  }

  public vtkPassInputTypeAlgorithm() { super(); }

  public vtkPassInputTypeAlgorithm(long id) { super(id); }
  public native long   VTKInit();

}
