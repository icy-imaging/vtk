// java wrapper for vtkImageOpenClose3D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageOpenClose3D extends vtkImageAlgorithm
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

  private native long GetMTime_4();
  public long GetMTime()
  {
    return GetMTime_4();
  }

  private native void DebugOn_5();
  public void DebugOn()
  {
    DebugOn_5();
  }

  private native void DebugOff_6();
  public void DebugOff()
  {
    DebugOff_6();
  }

  private native void Modified_7();
  public void Modified()
  {
    Modified_7();
  }

  private native void SetKernelSize_8(int id0,int id1,int id2);
  public void SetKernelSize(int id0,int id1,int id2)
  {
    SetKernelSize_8(id0,id1,id2);
  }

  private native void SetOpenValue_9(double id0);
  public void SetOpenValue(double id0)
  {
    SetOpenValue_9(id0);
  }

  private native double GetOpenValue_10();
  public double GetOpenValue()
  {
    return GetOpenValue_10();
  }

  private native void SetCloseValue_11(double id0);
  public void SetCloseValue(double id0)
  {
    SetCloseValue_11(id0);
  }

  private native double GetCloseValue_12();
  public double GetCloseValue()
  {
    return GetCloseValue_12();
  }

  private native long GetFilter0_13();
  public vtkImageDilateErode3D GetFilter0()
  {
    long temp = GetFilter0_13();

    if (temp == 0) return null;
    return (vtkImageDilateErode3D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetFilter1_14();
  public vtkImageDilateErode3D GetFilter1()
  {
    long temp = GetFilter1_14();

    if (temp == 0) return null;
    return (vtkImageDilateErode3D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkImageOpenClose3D() { super(); }

  public vtkImageOpenClose3D(long id) { super(id); }
  public native long   VTKInit();

}
