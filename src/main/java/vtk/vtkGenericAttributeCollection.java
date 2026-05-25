// java wrapper for vtkGenericAttributeCollection object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGenericAttributeCollection extends vtkObject
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

  private native int GetNumberOfAttributes_4();
  public int GetNumberOfAttributes()
  {
    return GetNumberOfAttributes_4();
  }

  private native int GetNumberOfComponents_5();
  public int GetNumberOfComponents()
  {
    return GetNumberOfComponents_5();
  }

  private native int GetNumberOfPointCenteredComponents_6();
  public int GetNumberOfPointCenteredComponents()
  {
    return GetNumberOfPointCenteredComponents_6();
  }

  private native int GetMaxNumberOfComponents_7();
  public int GetMaxNumberOfComponents()
  {
    return GetMaxNumberOfComponents_7();
  }

  private native long GetActualMemorySize_8();
  public long GetActualMemorySize()
  {
    return GetActualMemorySize_8();
  }

  private native int IsEmpty_9();
  public int IsEmpty()
  {
    return IsEmpty_9();
  }

  private native long GetAttribute_10(int id0);
  public vtkGenericAttribute GetAttribute(int id0)
  {
    long temp = GetAttribute_10(id0);

    if (temp == 0) return null;
    return (vtkGenericAttribute)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int FindAttribute_11(byte[] id0, int len0);
  public int FindAttribute(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return FindAttribute_11(bytes0, bytes0.length);
  }

  private native int GetAttributeIndex_12(int id0);
  public int GetAttributeIndex(int id0)
  {
    return GetAttributeIndex_12(id0);
  }

  private native void InsertNextAttribute_13(vtkGenericAttribute id0);
  public void InsertNextAttribute(vtkGenericAttribute id0)
  {
    InsertNextAttribute_13(id0);
  }

  private native void InsertAttribute_14(int id0,vtkGenericAttribute id1);
  public void InsertAttribute(int id0,vtkGenericAttribute id1)
  {
    InsertAttribute_14(id0,id1);
  }

  private native void RemoveAttribute_15(int id0);
  public void RemoveAttribute(int id0)
  {
    RemoveAttribute_15(id0);
  }

  private native void Reset_16();
  public void Reset()
  {
    Reset_16();
  }

  private native void DeepCopy_17(vtkGenericAttributeCollection id0);
  public void DeepCopy(vtkGenericAttributeCollection id0)
  {
    DeepCopy_17(id0);
  }

  private native void ShallowCopy_18(vtkGenericAttributeCollection id0);
  public void ShallowCopy(vtkGenericAttributeCollection id0)
  {
    ShallowCopy_18(id0);
  }

  private native long GetMTime_19();
  public long GetMTime()
  {
    return GetMTime_19();
  }

  private native int GetActiveAttribute_20();
  public int GetActiveAttribute()
  {
    return GetActiveAttribute_20();
  }

  private native int GetActiveComponent_21();
  public int GetActiveComponent()
  {
    return GetActiveComponent_21();
  }

  private native void SetActiveAttribute_22(int id0,int id1);
  public void SetActiveAttribute(int id0,int id1)
  {
    SetActiveAttribute_22(id0,id1);
  }

  private native int GetNumberOfAttributesToInterpolate_23();
  public int GetNumberOfAttributesToInterpolate()
  {
    return GetNumberOfAttributesToInterpolate_23();
  }

  private native void SetAttributesToInterpolateToAll_24();
  public void SetAttributesToInterpolateToAll()
  {
    SetAttributesToInterpolateToAll_24();
  }

  public vtkGenericAttributeCollection() { super(); }

  public vtkGenericAttributeCollection(long id) { super(id); }
  public native long   VTKInit();

}
