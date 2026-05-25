// java wrapper for vtkGenericAttribute object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGenericAttribute extends vtkObject
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

  private native byte[] GetName_4();
  public String GetName()
  {
    return new String(GetName_4(), StandardCharsets.UTF_8);
  }

  private native int GetNumberOfComponents_5();
  public int GetNumberOfComponents()
  {
    return GetNumberOfComponents_5();
  }

  private native int GetCentering_6();
  public int GetCentering()
  {
    return GetCentering_6();
  }

  private native int GetType_7();
  public int GetType()
  {
    return GetType_7();
  }

  private native int GetComponentType_8();
  public int GetComponentType()
  {
    return GetComponentType_8();
  }

  private native long GetSize_9();
  public long GetSize()
  {
    return GetSize_9();
  }

  private native long GetActualMemorySize_10();
  public long GetActualMemorySize()
  {
    return GetActualMemorySize_10();
  }

  private native void GetRange_11(int id0,double id1[]);
  public void GetRange(int id0,double id1[])
  {
    GetRange_11(id0,id1);
  }

  private native double GetMaxNorm_12();
  public double GetMaxNorm()
  {
    return GetMaxNorm_12();
  }

  private native double GetComponent_13(int id0,vtkGenericPointIterator id1);
  public double GetComponent(int id0,vtkGenericPointIterator id1)
  {
    return GetComponent_13(id0,id1);
  }

  private native void DeepCopy_14(vtkGenericAttribute id0);
  public void DeepCopy(vtkGenericAttribute id0)
  {
    DeepCopy_14(id0);
  }

  private native void ShallowCopy_15(vtkGenericAttribute id0);
  public void ShallowCopy(vtkGenericAttribute id0)
  {
    ShallowCopy_15(id0);
  }

  public vtkGenericAttribute() { super(); }

  public vtkGenericAttribute(long id) { super(id); }

}
