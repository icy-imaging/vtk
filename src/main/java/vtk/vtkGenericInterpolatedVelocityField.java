// java wrapper for vtkGenericInterpolatedVelocityField object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGenericInterpolatedVelocityField extends vtkFunctionSet
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

  private native void AddDataSet_4(vtkGenericDataSet id0);
  public void AddDataSet(vtkGenericDataSet id0)
  {
    AddDataSet_4(id0);
  }

  private native void ClearLastCell_5();
  public void ClearLastCell()
  {
    ClearLastCell_5();
  }

  private native long GetLastCell_6();
  public vtkGenericAdaptorCell GetLastCell()
  {
    long temp = GetLastCell_6();

    if (temp == 0) return null;
    return (vtkGenericAdaptorCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetLastLocalCoordinates_7(double id0[]);
  public int GetLastLocalCoordinates(double id0[])
  {
    return GetLastLocalCoordinates_7(id0);
  }

  private native int GetCaching_8();
  public int GetCaching()
  {
    return GetCaching_8();
  }

  private native void SetCaching_9(int id0);
  public void SetCaching(int id0)
  {
    SetCaching_9(id0);
  }

  private native void CachingOn_10();
  public void CachingOn()
  {
    CachingOn_10();
  }

  private native void CachingOff_11();
  public void CachingOff()
  {
    CachingOff_11();
  }

  private native int GetCacheHit_12();
  public int GetCacheHit()
  {
    return GetCacheHit_12();
  }

  private native int GetCacheMiss_13();
  public int GetCacheMiss()
  {
    return GetCacheMiss_13();
  }

  private native byte[] GetVectorsSelection_14();
  public String GetVectorsSelection()
  {
    return new String(GetVectorsSelection_14(), StandardCharsets.UTF_8);
  }

  private native void SelectVectors_15(byte[] id0, int len0);
  public void SelectVectors(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SelectVectors_15(bytes0, bytes0.length);
  }

  private native long GetLastDataSet_16();
  public vtkGenericDataSet GetLastDataSet()
  {
    long temp = GetLastDataSet_16();

    if (temp == 0) return null;
    return (vtkGenericDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CopyParameters_17(vtkGenericInterpolatedVelocityField id0);
  public void CopyParameters(vtkGenericInterpolatedVelocityField id0)
  {
    CopyParameters_17(id0);
  }

  public vtkGenericInterpolatedVelocityField() { super(); }

  public vtkGenericInterpolatedVelocityField(long id) { super(id); }
  public native long   VTKInit();

}
