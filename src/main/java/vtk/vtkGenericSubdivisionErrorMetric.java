// java wrapper for vtkGenericSubdivisionErrorMetric object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGenericSubdivisionErrorMetric extends vtkObject
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

  private native void SetGenericCell_4(vtkGenericAdaptorCell id0);
  public void SetGenericCell(vtkGenericAdaptorCell id0)
  {
    SetGenericCell_4(id0);
  }

  private native long GetGenericCell_5();
  public vtkGenericAdaptorCell GetGenericCell()
  {
    long temp = GetGenericCell_5();

    if (temp == 0) return null;
    return (vtkGenericAdaptorCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetDataSet_6(vtkGenericDataSet id0);
  public void SetDataSet(vtkGenericDataSet id0)
  {
    SetDataSet_6(id0);
  }

  private native long GetDataSet_7();
  public vtkGenericDataSet GetDataSet()
  {
    long temp = GetDataSet_7();

    if (temp == 0) return null;
    return (vtkGenericDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkGenericSubdivisionErrorMetric() { super(); }

  public vtkGenericSubdivisionErrorMetric(long id) { super(id); }

}
