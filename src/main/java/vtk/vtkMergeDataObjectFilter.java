// java wrapper for vtkMergeDataObjectFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMergeDataObjectFilter extends vtkDataSetAlgorithm
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

  private native void SetDataObjectInputData_4(vtkDataObject id0);
  public void SetDataObjectInputData(vtkDataObject id0)
  {
    SetDataObjectInputData_4(id0);
  }

  private native long GetDataObject_5();
  public vtkDataObject GetDataObject()
  {
    long temp = GetDataObject_5();

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetOutputField_6(int id0);
  public void SetOutputField(int id0)
  {
    SetOutputField_6(id0);
  }

  private native int GetOutputField_7();
  public int GetOutputField()
  {
    return GetOutputField_7();
  }

  private native void SetOutputFieldToDataObjectField_8();
  public void SetOutputFieldToDataObjectField()
  {
    SetOutputFieldToDataObjectField_8();
  }

  private native void SetOutputFieldToPointDataField_9();
  public void SetOutputFieldToPointDataField()
  {
    SetOutputFieldToPointDataField_9();
  }

  private native void SetOutputFieldToCellDataField_10();
  public void SetOutputFieldToCellDataField()
  {
    SetOutputFieldToCellDataField_10();
  }

  public vtkMergeDataObjectFilter() { super(); }

  public vtkMergeDataObjectFilter(long id) { super(id); }
  public native long   VTKInit();

}
