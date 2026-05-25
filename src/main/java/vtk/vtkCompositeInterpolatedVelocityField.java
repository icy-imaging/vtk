// java wrapper for vtkCompositeInterpolatedVelocityField object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCompositeInterpolatedVelocityField extends vtkAbstractInterpolatedVelocityField
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

  private native void SetLastCellId_4(long id0,int id1);
  public void SetLastCellId(long id0,int id1)
  {
    SetLastCellId_4(id0,id1);
  }

  private native void SetLastCellId_5(long id0);
  public void SetLastCellId(long id0)
  {
    SetLastCellId_5(id0);
  }

  private native int GetLastDataSetIndex_6();
  public int GetLastDataSetIndex()
  {
    return GetLastDataSetIndex_6();
  }

  private native int GetCacheDataSetHit_7();
  public int GetCacheDataSetHit()
  {
    return GetCacheDataSetHit_7();
  }

  private native int GetCacheDataSetMiss_8();
  public int GetCacheDataSetMiss()
  {
    return GetCacheDataSetMiss_8();
  }

  private native void CopyParameters_9(vtkAbstractInterpolatedVelocityField id0);
  public void CopyParameters(vtkAbstractInterpolatedVelocityField id0)
  {
    CopyParameters_9(id0);
  }

  public vtkCompositeInterpolatedVelocityField() { super(); }

  public vtkCompositeInterpolatedVelocityField(long id) { super(id); }
  public native long   VTKInit();

}
