// java wrapper for vtkSignedDistance object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSignedDistance extends vtkImageAlgorithm
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

  private native int[] GetDimensions_4();
  public int[] GetDimensions()
  {
    return GetDimensions_4();
  }

  private native void SetDimensions_5(int id0,int id1,int id2);
  public void SetDimensions(int id0,int id1,int id2)
  {
    SetDimensions_5(id0,id1,id2);
  }

  private native void SetDimensions_6(int id0[]);
  public void SetDimensions(int id0[])
  {
    SetDimensions_6(id0);
  }

  private native void SetBounds_7(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetBounds(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetBounds_7(id0,id1,id2,id3,id4,id5);
  }

  private native void SetBounds_8(double id0[]);
  public void SetBounds(double id0[])
  {
    SetBounds_8(id0);
  }

  private native double[] GetBounds_9();
  public double[] GetBounds()
  {
    return GetBounds_9();
  }

  private native void SetRadius_10(double id0);
  public void SetRadius(double id0)
  {
    SetRadius_10(id0);
  }

  private native double GetRadiusMinValue_11();
  public double GetRadiusMinValue()
  {
    return GetRadiusMinValue_11();
  }

  private native double GetRadiusMaxValue_12();
  public double GetRadiusMaxValue()
  {
    return GetRadiusMaxValue_12();
  }

  private native double GetRadius_13();
  public double GetRadius()
  {
    return GetRadius_13();
  }

  private native void SetLocator_14(vtkAbstractPointLocator id0);
  public void SetLocator(vtkAbstractPointLocator id0)
  {
    SetLocator_14(id0);
  }

  private native long GetLocator_15();
  public vtkAbstractPointLocator GetLocator()
  {
    long temp = GetLocator_15();

    if (temp == 0) return null;
    return (vtkAbstractPointLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void StartAppend_16();
  public void StartAppend()
  {
    StartAppend_16();
  }

  private native void Append_17(vtkPolyData id0);
  public void Append(vtkPolyData id0)
  {
    Append_17(id0);
  }

  private native void EndAppend_18();
  public void EndAppend()
  {
    EndAppend_18();
  }

  public vtkSignedDistance() { super(); }

  public vtkSignedDistance(long id) { super(id); }
  public native long   VTKInit();

}
