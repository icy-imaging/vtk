// java wrapper for vtkAMRInterpolatedVelocityField object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAMRInterpolatedVelocityField extends vtkAbstractInterpolatedVelocityField
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

  private native void SetAmrDataSet_4(vtkOverlappingAMR id0);
  public void SetAmrDataSet(vtkOverlappingAMR id0)
  {
    SetAmrDataSet_4(id0);
  }

  private native long GetAmrDataSet_5();
  public vtkOverlappingAMR GetAmrDataSet()
  {
    long temp = GetAmrDataSet_5();

    if (temp == 0) return null;
    return (vtkOverlappingAMR)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetAMRData_6(vtkOverlappingAMR id0);
  public void SetAMRData(vtkOverlappingAMR id0)
  {
    SetAMRData_6(id0);
  }

  private native void CopyParameters_7(vtkAbstractInterpolatedVelocityField id0);
  public void CopyParameters(vtkAbstractInterpolatedVelocityField id0)
  {
    CopyParameters_7(id0);
  }

  private native void SetLastCellId_8(long id0);
  public void SetLastCellId(long id0)
  {
    SetLastCellId_8(id0);
  }

  private native boolean SetLastDataSet_9(int id0,int id1);
  public boolean SetLastDataSet(int id0,int id1)
  {
    return SetLastDataSet_9(id0,id1);
  }

  private native void SetLastCellId_10(long id0,int id1);
  public void SetLastCellId(long id0,int id1)
  {
    SetLastCellId_10(id0,id1);
  }

  public vtkAMRInterpolatedVelocityField() { super(); }

  public vtkAMRInterpolatedVelocityField(long id) { super(id); }
  public native long   VTKInit();

}
