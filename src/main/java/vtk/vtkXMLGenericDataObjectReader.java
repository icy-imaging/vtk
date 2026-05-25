// java wrapper for vtkXMLGenericDataObjectReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkXMLGenericDataObjectReader extends vtkXMLDataReader
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

  private native long GetHierarchicalBoxDataSetOutput_6();
  public vtkHierarchicalBoxDataSet GetHierarchicalBoxDataSetOutput()
  {
    long temp = GetHierarchicalBoxDataSetOutput_6();

    if (temp == 0) return null;
    return (vtkHierarchicalBoxDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetImageDataOutput_7();
  public vtkImageData GetImageDataOutput()
  {
    long temp = GetImageDataOutput_7();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetMultiBlockDataSetOutput_8();
  public vtkMultiBlockDataSet GetMultiBlockDataSetOutput()
  {
    long temp = GetMultiBlockDataSetOutput_8();

    if (temp == 0) return null;
    return (vtkMultiBlockDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPolyDataOutput_9();
  public vtkPolyData GetPolyDataOutput()
  {
    long temp = GetPolyDataOutput_9();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetRectilinearGridOutput_10();
  public vtkRectilinearGrid GetRectilinearGridOutput()
  {
    long temp = GetRectilinearGridOutput_10();

    if (temp == 0) return null;
    return (vtkRectilinearGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetStructuredGridOutput_11();
  public vtkStructuredGrid GetStructuredGridOutput()
  {
    long temp = GetStructuredGridOutput_11();

    if (temp == 0) return null;
    return (vtkStructuredGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetUnstructuredGridOutput_12();
  public vtkUnstructuredGrid GetUnstructuredGridOutput()
  {
    long temp = GetUnstructuredGridOutput_12();

    if (temp == 0) return null;
    return (vtkUnstructuredGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetNumberOfPoints_13();
  public long GetNumberOfPoints()
  {
    return GetNumberOfPoints_13();
  }

  private native long GetNumberOfCells_14();
  public long GetNumberOfCells()
  {
    return GetNumberOfCells_14();
  }

  private native void SetupEmptyOutput_15();
  public void SetupEmptyOutput()
  {
    SetupEmptyOutput_15();
  }

  public vtkXMLGenericDataObjectReader() { super(); }

  public vtkXMLGenericDataObjectReader(long id) { super(id); }
  public native long   VTKInit();

}
