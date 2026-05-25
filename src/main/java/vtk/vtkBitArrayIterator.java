// java wrapper for vtkBitArrayIterator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkBitArrayIterator extends vtkArrayIterator
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

  private native void Initialize_4(vtkAbstractArray id0);
  public void Initialize(vtkAbstractArray id0)
  {
    Initialize_4(id0);
  }

  private native long GetArray_5();
  public vtkAbstractArray GetArray()
  {
    long temp = GetArray_5();

    if (temp == 0) return null;
    return (vtkAbstractArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetValue_6(long id0);
  public int GetValue(long id0)
  {
    return GetValue_6(id0);
  }

  private native long GetNumberOfTuples_7();
  public long GetNumberOfTuples()
  {
    return GetNumberOfTuples_7();
  }

  private native long GetNumberOfValues_8();
  public long GetNumberOfValues()
  {
    return GetNumberOfValues_8();
  }

  private native int GetNumberOfComponents_9();
  public int GetNumberOfComponents()
  {
    return GetNumberOfComponents_9();
  }

  private native int GetDataType_10();
  public int GetDataType()
  {
    return GetDataType_10();
  }

  private native int GetDataTypeSize_11();
  public int GetDataTypeSize()
  {
    return GetDataTypeSize_11();
  }

  private native void SetValue_12(long id0,int id1);
  public void SetValue(long id0,int id1)
  {
    SetValue_12(id0,id1);
  }

  public vtkBitArrayIterator() { super(); }

  public vtkBitArrayIterator(long id) { super(id); }
  public native long   VTKInit();

}
