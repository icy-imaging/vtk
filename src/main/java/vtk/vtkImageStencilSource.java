// java wrapper for vtkImageStencilSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageStencilSource extends vtkImageStencilAlgorithm
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

  private native void SetInformationInput_4(vtkImageData id0);
  public void SetInformationInput(vtkImageData id0)
  {
    SetInformationInput_4(id0);
  }

  private native long GetInformationInput_5();
  public vtkImageData GetInformationInput()
  {
    long temp = GetInformationInput_5();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetOutputOrigin_6(double id0,double id1,double id2);
  public void SetOutputOrigin(double id0,double id1,double id2)
  {
    SetOutputOrigin_6(id0,id1,id2);
  }

  private native void SetOutputOrigin_7(double id0[]);
  public void SetOutputOrigin(double id0[])
  {
    SetOutputOrigin_7(id0);
  }

  private native double[] GetOutputOrigin_8();
  public double[] GetOutputOrigin()
  {
    return GetOutputOrigin_8();
  }

  private native void SetOutputSpacing_9(double id0,double id1,double id2);
  public void SetOutputSpacing(double id0,double id1,double id2)
  {
    SetOutputSpacing_9(id0,id1,id2);
  }

  private native void SetOutputSpacing_10(double id0[]);
  public void SetOutputSpacing(double id0[])
  {
    SetOutputSpacing_10(id0);
  }

  private native double[] GetOutputSpacing_11();
  public double[] GetOutputSpacing()
  {
    return GetOutputSpacing_11();
  }

  private native void SetOutputWholeExtent_12(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetOutputWholeExtent(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetOutputWholeExtent_12(id0,id1,id2,id3,id4,id5);
  }

  private native void SetOutputWholeExtent_13(int id0[]);
  public void SetOutputWholeExtent(int id0[])
  {
    SetOutputWholeExtent_13(id0);
  }

  private native int[] GetOutputWholeExtent_14();
  public int[] GetOutputWholeExtent()
  {
    return GetOutputWholeExtent_14();
  }

  private native void ReportReferences_15(vtkGarbageCollector id0);
  public void ReportReferences(vtkGarbageCollector id0)
  {
    ReportReferences_15(id0);
  }

  public vtkImageStencilSource() { super(); }

  public vtkImageStencilSource(long id) { super(id); }
  public native long   VTKInit();

}
