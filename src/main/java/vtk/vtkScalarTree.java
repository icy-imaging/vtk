// java wrapper for vtkScalarTree object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkScalarTree extends vtkObject
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

  private native void ShallowCopy_4(vtkScalarTree id0);
  public void ShallowCopy(vtkScalarTree id0)
  {
    ShallowCopy_4(id0);
  }

  private native void SetDataSet_5(vtkDataSet id0);
  public void SetDataSet(vtkDataSet id0)
  {
    SetDataSet_5(id0);
  }

  private native long GetDataSet_6();
  public vtkDataSet GetDataSet()
  {
    long temp = GetDataSet_6();

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetScalars_7(vtkDataArray id0);
  public void SetScalars(vtkDataArray id0)
  {
    SetScalars_7(id0);
  }

  private native long GetScalars_8();
  public vtkDataArray GetScalars()
  {
    long temp = GetScalars_8();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void BuildTree_9();
  public void BuildTree()
  {
    BuildTree_9();
  }

  private native void Initialize_10();
  public void Initialize()
  {
    Initialize_10();
  }

  private native void InitTraversal_11(double id0);
  public void InitTraversal(double id0)
  {
    InitTraversal_11(id0);
  }

  private native double GetScalarValue_12();
  public double GetScalarValue()
  {
    return GetScalarValue_12();
  }

  private native long GetNumberOfCellBatches_13(double id0);
  public long GetNumberOfCellBatches(double id0)
  {
    return GetNumberOfCellBatches_13(id0);
  }

  public vtkScalarTree() { super(); }

  public vtkScalarTree(long id) { super(id); }

}
