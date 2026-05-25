// java wrapper for vtkSynchronizedTemplatesCutter3D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSynchronizedTemplatesCutter3D extends vtkSynchronizedTemplates3D
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

  private native void ThreadedExecute_4(vtkImageData id0,vtkInformation id1,int id2);
  public void ThreadedExecute(vtkImageData id0,vtkInformation id1,int id2)
  {
    ThreadedExecute_4(id0,id1,id2);
  }

  private native void SetCutFunction_5(vtkImplicitFunction id0);
  public void SetCutFunction(vtkImplicitFunction id0)
  {
    SetCutFunction_5(id0);
  }

  private native long GetCutFunction_6();
  public vtkImplicitFunction GetCutFunction()
  {
    long temp = GetCutFunction_6();

    if (temp == 0) return null;
    return (vtkImplicitFunction)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetOutputPointsPrecision_7(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_7(id0);
  }

  private native int GetOutputPointsPrecisionMinValue_8();
  public int GetOutputPointsPrecisionMinValue()
  {
    return GetOutputPointsPrecisionMinValue_8();
  }

  private native int GetOutputPointsPrecisionMaxValue_9();
  public int GetOutputPointsPrecisionMaxValue()
  {
    return GetOutputPointsPrecisionMaxValue_9();
  }

  private native int GetOutputPointsPrecision_10();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_10();
  }

  public vtkSynchronizedTemplatesCutter3D() { super(); }

  public vtkSynchronizedTemplatesCutter3D(long id) { super(id); }
  public native long   VTKInit();

}
